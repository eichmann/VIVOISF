package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookStatusIterator theBookStatusIterator = (BookStatusIterator)findAncestorWithClass(this, BookStatusIterator.class);
			pageContext.getOut().print(theBookStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for status tag ");
		}
		return SKIP_BODY;
	}
}

