package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookAsinIterator theBook = (BookAsinIterator)findAncestorWithClass(this, BookAsinIterator.class);
			pageContext.getOut().print(theBook.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for asin tag ");
		}
		return SKIP_BODY;
	}
}

