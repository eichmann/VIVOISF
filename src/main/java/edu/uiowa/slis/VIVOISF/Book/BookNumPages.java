package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNumPagesIterator theBook = (BookNumPagesIterator)findAncestorWithClass(this, BookNumPagesIterator.class);
			pageContext.getOut().print(theBook.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for numPages tag ");
		}
		return SKIP_BODY;
	}
}

