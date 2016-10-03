package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSici currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSiciIterator theBook = (BookSiciIterator)findAncestorWithClass(this, BookSiciIterator.class);
			pageContext.getOut().print(theBook.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for sici tag ");
		}
		return SKIP_BODY;
	}
}

