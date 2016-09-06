package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationGoverningAuthorityForIterator theOrganizationGoverningAuthorityForIterator = (OrganizationGoverningAuthorityForIterator)findAncestorWithClass(this, OrganizationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theOrganizationGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

