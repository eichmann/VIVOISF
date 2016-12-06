package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookGDPNotesIterator theBook = (BookGDPNotesIterator)findAncestorWithClass(this, BookGDPNotesIterator.class);
			pageContext.getOut().print(theBook.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

