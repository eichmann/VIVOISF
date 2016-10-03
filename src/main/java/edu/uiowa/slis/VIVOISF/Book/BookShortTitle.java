package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BookShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookShortTitleIterator theBook = (BookShortTitleIterator)findAncestorWithClass(this, BookShortTitleIterator.class);
			pageContext.getOut().print(theBook.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

