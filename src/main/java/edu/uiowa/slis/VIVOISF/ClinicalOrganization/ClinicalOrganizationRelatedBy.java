package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationRelatedByIterator theClinicalOrganizationRelatedByIterator = (ClinicalOrganizationRelatedByIterator)findAncestorWithClass(this, ClinicalOrganizationRelatedByIterator.class);
			pageContext.getOut().print(theClinicalOrganizationRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

