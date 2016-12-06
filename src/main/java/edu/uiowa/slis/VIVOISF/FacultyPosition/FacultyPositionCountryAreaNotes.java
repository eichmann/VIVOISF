package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCountryAreaNotesIterator theFacultyPosition = (FacultyPositionCountryAreaNotesIterator)findAncestorWithClass(this, FacultyPositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

