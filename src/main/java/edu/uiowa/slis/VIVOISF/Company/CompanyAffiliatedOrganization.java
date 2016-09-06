package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyAffiliatedOrganizationIterator theCompanyAffiliatedOrganizationIterator = (CompanyAffiliatedOrganizationIterator)findAncestorWithClass(this, CompanyAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theCompanyAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

