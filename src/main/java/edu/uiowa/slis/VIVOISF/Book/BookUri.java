package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookUri currentInstance = null;
	private static final Log log = LogFactory.getLog(BookUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookUriIterator theBook = (BookUriIterator)findAncestorWithClass(this, BookUriIterator.class);
			pageContext.getOut().print(theBook.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for uri tag ");
		}
		return SKIP_BODY;
	}
}

