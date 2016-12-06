package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPopulationNotesIterator theFacultyPosition = (FacultyPositionPopulationNotesIterator)findAncestorWithClass(this, FacultyPositionPopulationNotesIterator.class);
			pageContext.getOut().print(theFacultyPosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

