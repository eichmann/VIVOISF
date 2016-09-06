package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasSuccessorOrganizationIterator theCompanyHasSuccessorOrganizationIterator = (CompanyHasSuccessorOrganizationIterator)findAncestorWithClass(this, CompanyHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCompanyHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

