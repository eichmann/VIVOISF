package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(BookDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookDateTimeValueIterator theBookDateTimeValueIterator = (BookDateTimeValueIterator)findAncestorWithClass(this, BookDateTimeValueIterator.class);
			pageContext.getOut().print(theBookDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

