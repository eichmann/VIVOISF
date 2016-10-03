package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(BookUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookUpcIterator theBook = (BookUpcIterator)findAncestorWithClass(this, BookUpcIterator.class);
			pageContext.getOut().print(theBook.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for upc tag ");
		}
		return SKIP_BODY;
	}
}

