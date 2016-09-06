package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyHasSuccessorOrganizationIterator thePrivateCompanyHasSuccessorOrganizationIterator = (PrivateCompanyHasSuccessorOrganizationIterator)findAncestorWithClass(this, PrivateCompanyHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(thePrivateCompanyHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

