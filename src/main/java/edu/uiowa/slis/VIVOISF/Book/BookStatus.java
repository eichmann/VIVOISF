package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(BookStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookStatusIterator theBookStatusIterator = (BookStatusIterator)findAncestorWithClass(this, BookStatusIterator.class);
			pageContext.getOut().print(theBookStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for status tag ");
		}
		return SKIP_BODY;
	}
}

