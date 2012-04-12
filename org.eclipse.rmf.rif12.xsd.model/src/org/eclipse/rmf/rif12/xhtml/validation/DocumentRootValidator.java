/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif12.xhtml.validation;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.rmf.rif12.xhtml.AType;
import org.eclipse.rmf.rif12.xhtml.AbbrType;
import org.eclipse.rmf.rif12.xhtml.AcronymType;
import org.eclipse.rmf.rif12.xhtml.AddressType;
import org.eclipse.rmf.rif12.xhtml.BType;
import org.eclipse.rmf.rif12.xhtml.BigType;
import org.eclipse.rmf.rif12.xhtml.BlockquoteType;
import org.eclipse.rmf.rif12.xhtml.BodyType;
import org.eclipse.rmf.rif12.xhtml.BrType;
import org.eclipse.rmf.rif12.xhtml.CaptionType;
import org.eclipse.rmf.rif12.xhtml.CiteType;
import org.eclipse.rmf.rif12.xhtml.CodeType;
import org.eclipse.rmf.rif12.xhtml.ColType;
import org.eclipse.rmf.rif12.xhtml.ColgroupType;
import org.eclipse.rmf.rif12.xhtml.DdType;
import org.eclipse.rmf.rif12.xhtml.DelType;
import org.eclipse.rmf.rif12.xhtml.DfnType;
import org.eclipse.rmf.rif12.xhtml.DivType;
import org.eclipse.rmf.rif12.xhtml.DlType;
import org.eclipse.rmf.rif12.xhtml.DtType;
import org.eclipse.rmf.rif12.xhtml.EmType;
import org.eclipse.rmf.rif12.xhtml.H1Type;
import org.eclipse.rmf.rif12.xhtml.H2Type;
import org.eclipse.rmf.rif12.xhtml.H3Type;
import org.eclipse.rmf.rif12.xhtml.H4Type;
import org.eclipse.rmf.rif12.xhtml.H5Type;
import org.eclipse.rmf.rif12.xhtml.H6Type;
import org.eclipse.rmf.rif12.xhtml.HrType;
import org.eclipse.rmf.rif12.xhtml.HtmlType;
import org.eclipse.rmf.rif12.xhtml.IType;
import org.eclipse.rmf.rif12.xhtml.ImgType;
import org.eclipse.rmf.rif12.xhtml.InsType;
import org.eclipse.rmf.rif12.xhtml.KbdType;
import org.eclipse.rmf.rif12.xhtml.LiType;
import org.eclipse.rmf.rif12.xhtml.ObjectType;
import org.eclipse.rmf.rif12.xhtml.OlType;
import org.eclipse.rmf.rif12.xhtml.PType;
import org.eclipse.rmf.rif12.xhtml.ParamType;
import org.eclipse.rmf.rif12.xhtml.PreType;
import org.eclipse.rmf.rif12.xhtml.QType;
import org.eclipse.rmf.rif12.xhtml.SampType;
import org.eclipse.rmf.rif12.xhtml.SmallType;
import org.eclipse.rmf.rif12.xhtml.SpanType;
import org.eclipse.rmf.rif12.xhtml.StrikeType;
import org.eclipse.rmf.rif12.xhtml.StrongType;
import org.eclipse.rmf.rif12.xhtml.SubType;
import org.eclipse.rmf.rif12.xhtml.SupType;
import org.eclipse.rmf.rif12.xhtml.TableType;
import org.eclipse.rmf.rif12.xhtml.TbodyType;
import org.eclipse.rmf.rif12.xhtml.TdType;
import org.eclipse.rmf.rif12.xhtml.TfootType;
import org.eclipse.rmf.rif12.xhtml.ThType;
import org.eclipse.rmf.rif12.xhtml.TheadType;
import org.eclipse.rmf.rif12.xhtml.TrType;
import org.eclipse.rmf.rif12.xhtml.TtType;
import org.eclipse.rmf.rif12.xhtml.UType;
import org.eclipse.rmf.rif12.xhtml.UlType;
import org.eclipse.rmf.rif12.xhtml.VarType;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif12.xhtml.DocumentRoot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentRootValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateXMLNSPrefixMap(EMap<String, String> value);
	boolean validateXSISchemaLocation(EMap<String, String> value);
	boolean validateA(AType value);
	boolean validateAbbr(AbbrType value);
	boolean validateAcronym(AcronymType value);
	boolean validateAddress(AddressType value);
	boolean validateB(BType value);
	boolean validateBig(BigType value);
	boolean validateBlockquote(BlockquoteType value);
	boolean validateBody(BodyType value);
	boolean validateBr(BrType value);
	boolean validateCaption(CaptionType value);
	boolean validateCite(CiteType value);
	boolean validateCode(CodeType value);
	boolean validateCol(ColType value);
	boolean validateColgroup(ColgroupType value);
	boolean validateDd(DdType value);
	boolean validateDel(DelType value);
	boolean validateDfn(DfnType value);
	boolean validateDiv(DivType value);
	boolean validateDl(DlType value);
	boolean validateDt(DtType value);
	boolean validateEm(EmType value);
	boolean validateH1(H1Type value);
	boolean validateH2(H2Type value);
	boolean validateH3(H3Type value);
	boolean validateH4(H4Type value);
	boolean validateH5(H5Type value);
	boolean validateH6(H6Type value);
	boolean validateHr(HrType value);
	boolean validateHtml(HtmlType value);
	boolean validateI(IType value);
	boolean validateImg(ImgType value);
	boolean validateIns(InsType value);
	boolean validateKbd(KbdType value);
	boolean validateLi(LiType value);
	boolean validateObject(ObjectType value);
	boolean validateOl(OlType value);
	boolean validateP(PType value);
	boolean validateParam(ParamType value);
	boolean validatePre(PreType value);
	boolean validateQ(QType value);
	boolean validateSamp(SampType value);
	boolean validateSmall(SmallType value);
	boolean validateSpan(SpanType value);
	boolean validateStrike(StrikeType value);
	boolean validateStrong(StrongType value);
	boolean validateSub(SubType value);
	boolean validateSup(SupType value);
	boolean validateTable(TableType value);
	boolean validateTbody(TbodyType value);
	boolean validateTd(TdType value);
	boolean validateTfoot(TfootType value);
	boolean validateTh(ThType value);
	boolean validateThead(TheadType value);
	boolean validateTr(TrType value);
	boolean validateTt(TtType value);
	boolean validateU(UType value);
	boolean validateUl(UlType value);
	boolean validateVar(VarType value);
}
