package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHDIYearIterator theOrganization = (OrganizationHDIYearIterator)findAncestorWithClass(this, OrganizationHDIYearIterator.class);
			pageContext.getOut().print(theOrganization.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

