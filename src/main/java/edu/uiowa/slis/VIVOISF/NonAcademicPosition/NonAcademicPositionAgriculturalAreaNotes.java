package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionAgriculturalAreaNotesIterator theNonAcademicPosition = (NonAcademicPositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, NonAcademicPositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

