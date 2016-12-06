package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCountryAreaNotesIterator theLibrarianPosition = (LibrarianPositionCountryAreaNotesIterator)findAncestorWithClass(this, LibrarianPositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

