package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionLandAreaNotesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionLandAreaNotesIterator)findAncestorWithClass(this, FacultyAdministrativePositionLandAreaNotesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

