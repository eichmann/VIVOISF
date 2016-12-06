package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialRUIterator theBook = (BookNameOfficialRUIterator)findAncestorWithClass(this, BookNameOfficialRUIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

