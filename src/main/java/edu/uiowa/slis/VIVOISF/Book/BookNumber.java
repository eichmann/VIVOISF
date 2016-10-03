package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNumberIterator theBook = (BookNumberIterator)findAncestorWithClass(this, BookNumberIterator.class);
			pageContext.getOut().print(theBook.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for number tag ");
		}
		return SKIP_BODY;
	}
}

