package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationAffiliatedOrganizationInverseIterator theClinicalOrganizationAffiliatedOrganizationInverseIterator = (ClinicalOrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ClinicalOrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

