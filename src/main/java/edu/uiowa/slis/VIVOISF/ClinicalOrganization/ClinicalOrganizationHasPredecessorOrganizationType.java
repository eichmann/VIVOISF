package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationHasPredecessorOrganizationIterator theClinicalOrganizationHasPredecessorOrganizationIterator = (ClinicalOrganizationHasPredecessorOrganizationIterator)findAncestorWithClass(this, ClinicalOrganizationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theClinicalOrganizationHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

