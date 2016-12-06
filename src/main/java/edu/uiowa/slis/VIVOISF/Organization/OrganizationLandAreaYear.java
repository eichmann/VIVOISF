package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationLandAreaYearIterator theOrganization = (OrganizationLandAreaYearIterator)findAncestorWithClass(this, OrganizationLandAreaYearIterator.class);
			pageContext.getOut().print(theOrganization.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

