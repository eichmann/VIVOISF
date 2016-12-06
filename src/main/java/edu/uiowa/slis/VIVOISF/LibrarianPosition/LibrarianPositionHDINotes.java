package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHDINotesIterator theLibrarianPosition = (LibrarianPositionHDINotesIterator)findAncestorWithClass(this, LibrarianPositionHDINotesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

