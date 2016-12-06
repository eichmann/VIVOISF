package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionAgriculturalAreaNotesIterator theFacultyPosition = (FacultyPositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, FacultyPositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theFacultyPosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

