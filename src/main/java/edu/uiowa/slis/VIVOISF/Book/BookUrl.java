package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(BookUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookUrlIterator theBook = (BookUrlIterator)findAncestorWithClass(this, BookUrlIterator.class);
			pageContext.getOut().print(theBook.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for url tag ");
		}
		return SKIP_BODY;
	}
}

