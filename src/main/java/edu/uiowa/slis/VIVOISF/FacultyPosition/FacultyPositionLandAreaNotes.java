package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionLandAreaNotesIterator theFacultyPosition = (FacultyPositionLandAreaNotesIterator)findAncestorWithClass(this, FacultyPositionLandAreaNotesIterator.class);
			pageContext.getOut().print(theFacultyPosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

