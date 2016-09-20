package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationOBI_0000304InverseIterator theOrganizationOBI_0000304InverseIterator = (OrganizationOBI_0000304InverseIterator)findAncestorWithClass(this, OrganizationOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theOrganizationOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

