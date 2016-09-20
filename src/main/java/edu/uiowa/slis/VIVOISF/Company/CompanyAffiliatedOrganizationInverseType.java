package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyAffiliatedOrganizationInverseIterator theCompanyAffiliatedOrganizationInverseIterator = (CompanyAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, CompanyAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theCompanyAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

