package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationEditorInverseIterator theClinicalOrganizationEditorInverseIterator = (ClinicalOrganizationEditorInverseIterator)findAncestorWithClass(this, ClinicalOrganizationEditorInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for editor tag ");
		}
		return SKIP_BODY;
	}
}

