package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionDateTimeIntervalIterator theBookSectionDateTimeIntervalIterator = (BookSectionDateTimeIntervalIterator)findAncestorWithClass(this, BookSectionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theBookSectionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

