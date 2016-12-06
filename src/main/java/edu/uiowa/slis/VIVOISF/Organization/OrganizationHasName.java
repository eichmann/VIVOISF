package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasNameIterator theOrganizationHasNameIterator = (OrganizationHasNameIterator)findAncestorWithClass(this, OrganizationHasNameIterator.class);
			pageContext.getOut().print(theOrganizationHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasName tag ");
		}
		return SKIP_BODY;
	}
}

