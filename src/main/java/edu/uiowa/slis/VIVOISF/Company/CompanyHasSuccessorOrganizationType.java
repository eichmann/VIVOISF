package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasSuccessorOrganizationIterator theCompanyHasSuccessorOrganizationIterator = (CompanyHasSuccessorOrganizationIterator)findAncestorWithClass(this, CompanyHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theCompanyHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

