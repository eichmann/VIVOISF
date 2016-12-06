package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionPopulationNotesIterator theLibrarianPosition = (LibrarianPositionPopulationNotesIterator)findAncestorWithClass(this, LibrarianPositionPopulationNotesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

