package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionAgriculturalAreaNotesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, FacultyAdministrativePositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

