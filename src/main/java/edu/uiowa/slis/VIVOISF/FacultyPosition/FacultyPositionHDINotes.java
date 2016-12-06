package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHDINotesIterator theFacultyPosition = (FacultyPositionHDINotesIterator)findAncestorWithClass(this, FacultyPositionHDINotesIterator.class);
			pageContext.getOut().print(theFacultyPosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

