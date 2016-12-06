package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionAgriculturalAreaNotesIterator theLibrarianPosition = (LibrarianPositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, LibrarianPositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

