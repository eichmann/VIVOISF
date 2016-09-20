package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAffiliatedOrganizationInverseIterator theOrganizationAffiliatedOrganizationInverseIterator = (OrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, OrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theOrganizationAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

