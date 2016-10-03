package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(BookLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookLocatorIterator theBook = (BookLocatorIterator)findAncestorWithClass(this, BookLocatorIterator.class);
			pageContext.getOut().print(theBook.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for locator tag ");
		}
		return SKIP_BODY;
	}
}

