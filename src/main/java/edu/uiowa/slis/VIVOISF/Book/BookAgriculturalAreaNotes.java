package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookAgriculturalAreaNotesIterator theBook = (BookAgriculturalAreaNotesIterator)findAncestorWithClass(this, BookAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theBook.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

