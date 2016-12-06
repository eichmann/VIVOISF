package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookLandAreaNotesIterator theBook = (BookLandAreaNotesIterator)findAncestorWithClass(this, BookLandAreaNotesIterator.class);
			pageContext.getOut().print(theBook.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

