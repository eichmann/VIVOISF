package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortRUIterator theBook = (BookNameShortRUIterator)findAncestorWithClass(this, BookNameShortRUIterator.class);
			pageContext.getOut().print(theBook.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

