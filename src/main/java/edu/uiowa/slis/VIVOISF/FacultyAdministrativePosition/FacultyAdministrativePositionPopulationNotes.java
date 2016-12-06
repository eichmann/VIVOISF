package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPopulationNotesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionPopulationNotesIterator)findAncestorWithClass(this, FacultyAdministrativePositionPopulationNotesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

