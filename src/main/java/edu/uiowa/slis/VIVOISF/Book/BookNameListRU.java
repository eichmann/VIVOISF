package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListRUIterator theBook = (BookNameListRUIterator)findAncestorWithClass(this, BookNameListRUIterator.class);
			pageContext.getOut().print(theBook.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

