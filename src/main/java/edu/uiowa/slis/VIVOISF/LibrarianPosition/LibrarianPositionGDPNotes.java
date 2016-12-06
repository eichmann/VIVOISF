package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionGDPNotesIterator theLibrarianPosition = (LibrarianPositionGDPNotesIterator)findAncestorWithClass(this, LibrarianPositionGDPNotesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

