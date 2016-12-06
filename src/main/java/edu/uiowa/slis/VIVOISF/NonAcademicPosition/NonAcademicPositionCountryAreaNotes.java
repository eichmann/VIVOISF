package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCountryAreaNotesIterator theNonAcademicPosition = (NonAcademicPositionCountryAreaNotesIterator)findAncestorWithClass(this, NonAcademicPositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

