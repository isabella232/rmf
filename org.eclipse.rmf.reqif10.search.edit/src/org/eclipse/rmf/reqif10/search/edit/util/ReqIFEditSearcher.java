/**
 * 
 */
package org.eclipse.rmf.reqif10.search.edit.util;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.util.ReqIFSearcher;

/**
 * @author Hussein MHANNA
 *
 */
public class ReqIFEditSearcher extends ReqIFSearcher {
	/**
	 * The editing domain
	 */
	private EditingDomain editingDomain;
	/**
	 * The compound command
	 */
	private CompoundCommand compoundCommand;

	/**
	 * The constructor
	 * 
	 * @param editingDomain
	 *            : The editing domain
	 */
	public ReqIFEditSearcher(EditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
	}

	public static Collection<EObject> find(ResourceSet resourceSet,
			Collection<Criteria> criterias) {
		ReqIFSearcher searcher = new ReqIFSearcher();
		return searcher.search(resourceSet, criterias);
	}

	public static Collection<EObject> findAndReplcae(
			EditingDomain editingDomain, ResourceSet resourceSet,
			Collection<Criteria> criterias) {
		ReqIFEditSearcher searcher = new ReqIFEditSearcher(editingDomain);
		return searcher.replace(resourceSet, criterias);
	}

	@Override
	public Collection<EObject> replace(ResourceSet resourceSet,
			Collection<Criteria> criterias) {
		compoundCommand = new CompoundCommand();
		Collection<EObject> result = super.replace(resourceSet, criterias);
		editingDomain.getCommandStack().execute(compoundCommand);
		compoundCommand = null;
		return result;
	}

	@Override
	protected void doSetValue(EObject eObject, EStructuralFeature feature,
			Object value) {
		Command command = SetCommand.create(editingDomain, eObject, feature,
				value);
		compoundCommand.append(command);
	}

}
