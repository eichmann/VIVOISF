package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCountryAreaYearIterator theOrganization = (OrganizationCountryAreaYearIterator)findAncestorWithClass(this, OrganizationCountryAreaYearIterator.class);
			pageContext.getOut().print(theOrganization.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

