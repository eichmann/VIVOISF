package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionGDPNotesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionGDPNotesIterator)findAncestorWithClass(this, FacultyAdministrativePositionGDPNotesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

