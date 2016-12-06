package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationPopulationNotesIterator theOrganization = (OrganizationPopulationNotesIterator)findAncestorWithClass(this, OrganizationPopulationNotesIterator.class);
			pageContext.getOut().print(theOrganization.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

