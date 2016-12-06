package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHDINotesIterator theBook = (BookHDINotesIterator)findAncestorWithClass(this, BookHDINotesIterator.class);
			pageContext.getOut().print(theBook.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

