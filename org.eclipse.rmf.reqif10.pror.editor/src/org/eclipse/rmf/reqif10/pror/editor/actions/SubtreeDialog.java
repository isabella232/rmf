/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.actions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.constraints.validator.Issue;
import org.eclipse.rmf.reqif10.constraints.validator.ReqIFValidator;
import org.eclipse.rmf.reqif10.pror.editor.IReqifEditor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ProrAdapterFactoryContentProvider;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertySheetPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Sash;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.PlatformUI;

/**
 * This modal dialog shows the tree hanging on a provided {@link EObject}. The
 * idea is to use this to allow the user to configure things selectively (e.g.
 * the columns of a {@link Specification}).
 * 
 * @author jastram
 * 
 */
public class SubtreeDialog extends TrayDialog implements IMenuListener {

	private static final int VALIDATE_ID = 99;
	private final EObject input;
	private final String title;
	private final String helpContext;
	private ISelectionProvider originalSelectionProvider;
	private IAction[] actions = new IAction[] {};
	private boolean presentAsDropdown;
	private TreeViewer viewer;
	private final List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
	private final AdapterFactory adapterFactory;
	private final EditingDomain editingDomain;
	private final IReqifEditor reqifEditor;
	private CommandStackListener commandStackListener;
	private EContentAdapter enumValueAdapter;

	protected SubtreeDialog(IReqifEditor reqifEditor, EObject input, String title,
			String helpContext) {
		super(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		this.reqifEditor = reqifEditor;
		this.editingDomain = reqifEditor.getEditingDomain();
		this.adapterFactory = reqifEditor.getAdapterFactory();
		this.input = input;
		this.title = title;
		this.helpContext = helpContext;
		setHelpAvailable(true);
		
		addEnumValueListener();
		
	}

	private void addEnumValueListener() {
			enumValueAdapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					super.notifyChanged(notification);
					
					if (! notification.isTouch() 
							&& notification.getNotifier() instanceof DatatypeDefinitionEnumeration
							&& notification.getEventType() == Notification.ADD
							&& notification.getFeatureID(DatatypeDefinitionEnumeration.class) == ReqIF10Package.DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES
							&& notification.getNewValue() instanceof EnumValue
							){
						EnumValue enumValue = (EnumValue) notification.getNewValue();
						EmbeddedValue properties = getOrCreateProperties(enumValue);
						initializeProperties(properties);
						
						if (properties.getKey() == null){
							properties.setKey(BigInteger.ONE);
						}
						if (properties.getOtherContent() == null || "".equals(properties.getOtherContent())){
							properties.setOtherContent("foo");
						}
					}
				}
			};
			
			input.eAdapters().add(enumValueAdapter);
	}

	
	void addFilter(ViewerFilter filter) {
		filters.add(filter);
	}
	
	/**
	 * Get or create an {@link EnumValue}s embeddedProperties
	 * 
	 * If enumValue does have an embeddedValue set, it is returned Otherwise a
	 * new {@link EmbeddedValue} is created, set as the enumValues Properties
	 * and the returned
	 * 
	 * @param enumValue
	 * @return
	 */
	private EmbeddedValue getOrCreateProperties(EnumValue enumValue) {
		EmbeddedValue properties = enumValue.getProperties();
		if (null != properties){
			return properties;
		}
		properties = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		enumValue.setProperties(properties);
		return properties;
	}
	
	
	/**
	 * If embeddedValue does not have key and otherContent set:
	 * 
	 * Scan all {@link EmbeddedValue}s in the reqif document and find the highest key
	 * Set key of embeddedValue to highest key + 1
	 * Set OtherContent of embeddedValue to the String representaion of its key 
	 * 
	 * @param embeddedValue 
	 */
	private void initializeProperties(EmbeddedValue embeddedValue){
		BigInteger max = BigInteger.valueOf(0);
		
		ReqIFContent content = (ReqIFContent) input;
		EList<DatatypeDefinition> datatypes = content.getDatatypes();
		for (DatatypeDefinition datatypeDefinition : datatypes) {
			if (datatypeDefinition instanceof DatatypeDefinitionEnumeration) {
				DatatypeDefinitionEnumeration ddEnum = (DatatypeDefinitionEnumeration) datatypeDefinition;
				for (EnumValue enumValue : ddEnum.getSpecifiedValues()) {
					EmbeddedValue properties = enumValue.getProperties();
					if (properties!=null){
						BigInteger key = properties.getKey();
						if (key!=null){
							max = max.max(key);
						}
					}
				}
				
			}
		}
		
		embeddedValue.setKey(max.add(BigInteger.ONE));
		embeddedValue.setOtherContent(max.add(BigInteger.ONE).toString());
	}

	/**
	 * We provide the default "Finish" button, instead of the default OK and
	 * Cancel.
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID,
				IDialogConstants.FINISH_LABEL, true);

		createButton(parent, VALIDATE_ID, "Validate", false);
	}

	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId == VALIDATE_ID) {
			validate();
		} else {
			super.buttonPressed(buttonId);
		}
	}
	
	
	protected void validate(){
		EList<EObject> objects = new BasicEList<EObject>(); 
		if (input instanceof ReqIFContent) {
			ReqIFContent content = (ReqIFContent) input;
			objects.addAll(content.getSpecTypes());
			objects.addAll(content.getDatatypes());
		}else{
			objects.add(input);
		}
		
		ReqIFValidator validator = new ReqIFValidator();
		validator.disableSchemaValidation();
		
		List<Issue> issues = new LinkedList<Issue>();
		for (EObject eObject : objects) {
			issues.addAll(validator.validate(eObject));
		}
		
		ValidationResultDialog dialog = new ValidationResultDialog(this.getParentShell());
		dialog.setIssues(issues);
		dialog.setTargetViewer(viewer);
		dialog.open();
	}
	
	@Override
	protected Point getInitialSize() {
		return new Point(600, 600);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		this.getShell().setText(title);

		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new FormLayout());

		ToolBar toolbar = presentAsDropdown ? buildDropdownToolbar(composite)
				: buildRowToolbar(composite);

		// Enable help
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, helpContext);

		final Sash sash = new Sash(composite, SWT.HORIZONTAL | SWT.BORDER);
		FormData data = new FormData();
		data.bottom = new FormAttachment(50, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		sash.setLayoutData(data);

		// Without this, the sash wouldn't hold its new position
		sash.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				sash.setBounds(e.x, e.y, e.width, e.height);
				((FormData) sash.getLayoutData()).bottom = new FormAttachment(
						0, e.y);
				sash.getParent().layout();
			}
		});

		viewer = new TreeViewer(composite, SWT.BORDER);
		viewer.setContentProvider(new ProrAdapterFactoryContentProvider(
				getAdapterFactory()));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(
				getAdapterFactory()));
		viewer.setInput(input);
		viewer.setFilters(filters.toArray(new ViewerFilter[] {}));
		createContextMenuFor(viewer);

		viewer.getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					ISelection selection = viewer.getSelection();
					TreeSelection treeSelection = (TreeSelection) selection;
					Object firstElement = treeSelection.getFirstElement();
					Command create = DeleteCommand.create(editingDomain,
							firstElement);
					editingDomain.getCommandStack().execute(create);
				}
			}
		});

		data = new FormData();
		data.top = new FormAttachment(toolbar, 0);
		data.bottom = new FormAttachment(sash, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		viewer.getControl().setLayoutData(data);

		// Now that we have the TreeViewer, let's attach the Toolbar
		data = new FormData();
		data.bottom = new FormAttachment(viewer.getControl(), 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		toolbar.setLayoutData(data);

		final ProrPropertySheetPage propertySheet = new ProrPropertySheetPage(
				(AdapterFactoryEditingDomain) editingDomain, adapterFactory);
		propertySheet.createControl(composite);

		data = new FormData();
		data.top = new FormAttachment(sash, 0);
		data.bottom = new FormAttachment(100, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		propertySheet.getControl().setLayoutData(data);

		// The and Property Sheet Editor must know about changes, so that the context
		// menu contains the correct child creation actions.
		originalSelectionProvider = getActionBarContributor().getActiveEditor()
				.getSite().getSelectionProvider();
		getActionBarContributor().getActiveEditor().getSite()
				.setSelectionProvider(viewer);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				((ISelectionChangedListener)getActionBarContributor()).selectionChanged(event);
				propertySheet.selectionChanged(null, event.getSelection());
				((ISelectionProvider) getActionBarContributor()
						.getActiveEditor()).setSelection(event.getSelection());
			}
		});
		
		commandStackListener = new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				Display.getCurrent().asyncExec(new Runnable() {
					public void run() {
						Command mostRecentCommand = ((CommandStack) event
								.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							StructuredSelection selection = new StructuredSelection(
									new ArrayList<Object>(mostRecentCommand
											.getAffectedObjects()));
							viewer.setSelection(selection);
						}
					}
				});

			}
		};
		editingDomain.getCommandStack().addCommandStackListener(
				commandStackListener);
		
		return composite;
	}

	/**
	 * It's unbelievable that there is no better way for doing this! I
	 * couldn't even use {@link MenuManager} to add the action, as that created
	 * an additional menu hierarchy that I couldn't get rid of!
	 * 
	 * @param composite
	 * @return
	 */
	private ToolBar buildDropdownToolbar(Composite composite) {
		final ToolBar toolbar = new ToolBar(composite, SWT.PUSH);

		final Menu menu = new Menu(getShell(), SWT.POP_UP);
		for (final IAction action : actions) {
			MenuItem newItem = new MenuItem(menu, SWT.PUSH);
			newItem.setText(action.getText());
			newItem.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					action.run();
				}
			});

		}

		final ToolItem item = new ToolItem(toolbar, SWT.DROP_DOWN);
		item.setText("Select Action...");
		item.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				// The following code would allow to distinguish arrow and
				// button, something we don't need right now.
				// if (event.detail == SWT.ARROW) {
				Rectangle rect = item.getBounds();
				Point pt = new Point(rect.x, rect.y + rect.height);
				pt = toolbar.toDisplay(pt);
				menu.setLocation(pt.x, pt.y);
				menu.setVisible(true);
			}
			// }
		});
		return toolbar;
	}

	private ToolBar buildRowToolbar(Composite composite) {
		ToolBar toolbar = new ToolBar(composite, SWT.PUSH | SWT.WRAP);
		ToolBarManager toolbarManager = new ToolBarManager(toolbar);
		for (IAction action : actions) {
			toolbarManager.add(action);
		}
		
		toolbarManager.update(true);
		return toolbar;
	}

	private AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(
				viewer));
		viewer.addDropSupport(dndOperations, transfers,
				new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	public void menuAboutToShow(IMenuManager menuManager) {
		getActionBarContributor().menuAboutToShow(menuManager);

		// Some actions may have the wrong selection, because the
		// ActionBarContributor grabs it from the associated editor.
		for (IContributionItem item : menuManager.getItems()) {
			if (item instanceof ActionContributionItem) {
				IAction action = ((ActionContributionItem) item).getAction();
				if (action instanceof CommandActionHandler) {
					CommandActionHandler handler = (CommandActionHandler) action;
					handler.updateSelection((IStructuredSelection) viewer.getSelection());
				}
			}
		}
		
	}

	private EditingDomainActionBarContributor getActionBarContributor() {
		return reqifEditor.getActionBarContributor();
	}

	@Override
	public boolean close() {
		getActionBarContributor().getActiveEditor().getSite()
				.setSelectionProvider(originalSelectionProvider);
		if (commandStackListener != null) {
			editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);
		}
		
		input.eAdapters().remove(enumValueAdapter);
		
		return super.close();
	}

	/**
	 * If Actions are set before opening the Dialog, then these are presented in
	 * a row or in a dropdown.
	 * <p>
	 * 
	 * When shown in a row, the text is omitted and only the icon shown. This
	 * makes sense for a small number of well-defined actions.
	 * <p>
	 * 
	 * When shown in a dropdown, both icon and text are shown. This makes sense
	 * when the text is important and/or the number of items is unknown.
	 * 
	 * @param actions
	 * @param presentAsDropdown
	 */
	public void setActions(IAction[] actions, boolean presentAsDropdown) {
		this.actions = actions;
		this.presentAsDropdown = presentAsDropdown;
	}
}
