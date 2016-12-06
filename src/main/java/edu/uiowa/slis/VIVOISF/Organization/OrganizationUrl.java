package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationUrlIterator theOrganization = (OrganizationUrlIterator)findAncestorWithClass(this, OrganizationUrlIterator.class);
			pageContext.getOut().print(theOrganization.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for url tag ");
		}
		return SKIP_BODY;
	}
}

