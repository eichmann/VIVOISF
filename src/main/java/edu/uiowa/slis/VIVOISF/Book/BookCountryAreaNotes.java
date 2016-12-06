package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCountryAreaNotesIterator theBook = (BookCountryAreaNotesIterator)findAncestorWithClass(this, BookCountryAreaNotesIterator.class);
			pageContext.getOut().print(theBook.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

