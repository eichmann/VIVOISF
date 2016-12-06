package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationPopulationYearIterator theOrganization = (OrganizationPopulationYearIterator)findAncestorWithClass(this, OrganizationPopulationYearIterator.class);
			pageContext.getOut().print(theOrganization.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

