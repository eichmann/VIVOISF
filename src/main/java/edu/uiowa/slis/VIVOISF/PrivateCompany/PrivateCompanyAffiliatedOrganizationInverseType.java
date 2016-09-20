package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyAffiliatedOrganizationInverseIterator thePrivateCompanyAffiliatedOrganizationInverseIterator = (PrivateCompanyAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, PrivateCompanyAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

