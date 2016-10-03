package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodenIterator theBook = (BookCodenIterator)findAncestorWithClass(this, BookCodenIterator.class);
			pageContext.getOut().print(theBook.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for coden tag ");
		}
		return SKIP_BODY;
	}
}

