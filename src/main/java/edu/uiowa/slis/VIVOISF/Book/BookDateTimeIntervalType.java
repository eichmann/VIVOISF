package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookDateTimeIntervalIterator theBookDateTimeIntervalIterator = (BookDateTimeIntervalIterator)findAncestorWithClass(this, BookDateTimeIntervalIterator.class);
			pageContext.getOut().print(theBookDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

