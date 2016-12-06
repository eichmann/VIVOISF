package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCountryAreaNotesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCountryAreaNotesIterator)findAncestorWithClass(this, FacultyAdministrativePositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

