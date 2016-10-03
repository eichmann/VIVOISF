package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPagesIterator theBook = (BookPagesIterator)findAncestorWithClass(this, BookPagesIterator.class);
			pageContext.getOut().print(theBook.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for pages tag ");
		}
		return SKIP_BODY;
	}
}

