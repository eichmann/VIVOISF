package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionLandAreaNotesIterator theNonAcademicPosition = (NonAcademicPositionLandAreaNotesIterator)findAncestorWithClass(this, NonAcademicPositionLandAreaNotesIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

