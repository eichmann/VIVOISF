package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationGDPYearIterator theOrganization = (OrganizationGDPYearIterator)findAncestorWithClass(this, OrganizationGDPYearIterator.class);
			pageContext.getOut().print(theOrganization.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

