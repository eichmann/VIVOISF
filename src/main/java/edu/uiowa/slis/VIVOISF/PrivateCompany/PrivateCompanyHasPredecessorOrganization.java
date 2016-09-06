package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyHasPredecessorOrganizationIterator thePrivateCompanyHasPredecessorOrganizationIterator = (PrivateCompanyHasPredecessorOrganizationIterator)findAncestorWithClass(this, PrivateCompanyHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(thePrivateCompanyHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

