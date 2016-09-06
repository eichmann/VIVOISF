package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPageEndIterator theBook = (BookPageEndIterator)findAncestorWithClass(this, BookPageEndIterator.class);
			pageContext.getOut().print(theBook.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

