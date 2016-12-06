package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHDINotesIterator theOrganization = (OrganizationHDINotesIterator)findAncestorWithClass(this, OrganizationHDINotesIterator.class);
			pageContext.getOut().print(theOrganization.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

