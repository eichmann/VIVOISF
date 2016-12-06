package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationPopulationTotalIterator theOrganization = (OrganizationPopulationTotalIterator)findAncestorWithClass(this, OrganizationPopulationTotalIterator.class);
			pageContext.getOut().print(theOrganization.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

