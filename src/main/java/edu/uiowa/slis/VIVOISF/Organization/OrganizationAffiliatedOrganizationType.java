package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAffiliatedOrganizationIterator theOrganizationAffiliatedOrganizationIterator = (OrganizationAffiliatedOrganizationIterator)findAncestorWithClass(this, OrganizationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theOrganizationAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

