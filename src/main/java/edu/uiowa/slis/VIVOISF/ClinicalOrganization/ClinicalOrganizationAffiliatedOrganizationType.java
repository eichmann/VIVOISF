package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationAffiliatedOrganizationIterator theClinicalOrganizationAffiliatedOrganizationIterator = (ClinicalOrganizationAffiliatedOrganizationIterator)findAncestorWithClass(this, ClinicalOrganizationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theClinicalOrganizationAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

