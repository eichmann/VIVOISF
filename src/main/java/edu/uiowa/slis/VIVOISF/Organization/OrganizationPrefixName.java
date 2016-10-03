package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationPrefixNameIterator theOrganization = (OrganizationPrefixNameIterator)findAncestorWithClass(this, OrganizationPrefixNameIterator.class);
			pageContext.getOut().print(theOrganization.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

