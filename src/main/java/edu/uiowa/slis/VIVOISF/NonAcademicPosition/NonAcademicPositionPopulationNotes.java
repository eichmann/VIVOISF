package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionPopulationNotesIterator theNonAcademicPosition = (NonAcademicPositionPopulationNotesIterator)findAncestorWithClass(this, NonAcademicPositionPopulationNotesIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

