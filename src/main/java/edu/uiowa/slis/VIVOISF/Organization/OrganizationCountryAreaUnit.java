package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCountryAreaUnitIterator theOrganization = (OrganizationCountryAreaUnitIterator)findAncestorWithClass(this, OrganizationCountryAreaUnitIterator.class);
			pageContext.getOut().print(theOrganization.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

