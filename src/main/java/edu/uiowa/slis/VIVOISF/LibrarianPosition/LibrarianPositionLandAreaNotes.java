package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionLandAreaNotesIterator theLibrarianPosition = (LibrarianPositionLandAreaNotesIterator)findAncestorWithClass(this, LibrarianPositionLandAreaNotesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

