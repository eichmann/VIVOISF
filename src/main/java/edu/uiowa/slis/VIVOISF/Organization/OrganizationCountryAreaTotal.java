package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCountryAreaTotalIterator theOrganization = (OrganizationCountryAreaTotalIterator)findAncestorWithClass(this, OrganizationCountryAreaTotalIterator.class);
			pageContext.getOut().print(theOrganization.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

