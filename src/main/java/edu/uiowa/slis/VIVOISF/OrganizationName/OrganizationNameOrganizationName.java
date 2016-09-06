package edu.uiowa.slis.VIVOISF.OrganizationName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOrganizationName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOrganizationName currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOrganizationName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOrganizationNameIterator theOrganizationName = (OrganizationNameOrganizationNameIterator)findAncestorWithClass(this, OrganizationNameOrganizationNameIterator.class);
			pageContext.getOut().print(theOrganizationName.getOrganizationName());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationName for organizationName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for organizationName tag ");
		}
		return SKIP_BODY;
	}
}

