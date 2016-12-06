package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationPopulationUnitIterator theOrganization = (OrganizationPopulationUnitIterator)findAncestorWithClass(this, OrganizationPopulationUnitIterator.class);
			pageContext.getOut().print(theOrganization.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

