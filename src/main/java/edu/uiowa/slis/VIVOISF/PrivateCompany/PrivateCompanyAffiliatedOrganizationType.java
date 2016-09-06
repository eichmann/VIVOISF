package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyAffiliatedOrganizationIterator thePrivateCompanyAffiliatedOrganizationIterator = (PrivateCompanyAffiliatedOrganizationIterator)findAncestorWithClass(this, PrivateCompanyAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(thePrivateCompanyAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

