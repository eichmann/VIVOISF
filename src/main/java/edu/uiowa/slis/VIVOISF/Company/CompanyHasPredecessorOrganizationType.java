package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasPredecessorOrganizationIterator theCompanyHasPredecessorOrganizationIterator = (CompanyHasPredecessorOrganizationIterator)findAncestorWithClass(this, CompanyHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theCompanyHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

