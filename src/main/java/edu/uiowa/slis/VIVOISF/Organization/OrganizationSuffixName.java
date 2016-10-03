package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationSuffixNameIterator theOrganization = (OrganizationSuffixNameIterator)findAncestorWithClass(this, OrganizationSuffixNameIterator.class);
			pageContext.getOut().print(theOrganization.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

