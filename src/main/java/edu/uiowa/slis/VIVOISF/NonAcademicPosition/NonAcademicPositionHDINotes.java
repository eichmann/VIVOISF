package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHDINotesIterator theNonAcademicPosition = (NonAcademicPositionHDINotesIterator)findAncestorWithClass(this, NonAcademicPositionHDINotesIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}
