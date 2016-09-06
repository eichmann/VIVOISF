package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPageStartIterator theBook = (BookPageStartIterator)findAncestorWithClass(this, BookPageStartIterator.class);
			pageContext.getOut().print(theBook.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

