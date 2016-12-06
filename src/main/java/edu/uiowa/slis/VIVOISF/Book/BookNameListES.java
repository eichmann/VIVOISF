package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListESIterator theBook = (BookNameListESIterator)findAncestorWithClass(this, BookNameListESIterator.class);
			pageContext.getOut().print(theBook.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

