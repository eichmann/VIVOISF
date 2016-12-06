package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListZHIterator theBook = (BookNameListZHIterator)findAncestorWithClass(this, BookNameListZHIterator.class);
			pageContext.getOut().print(theBook.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

