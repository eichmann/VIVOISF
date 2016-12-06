package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionDateTimeValueIterator theBookSectionDateTimeValueIterator = (BookSectionDateTimeValueIterator)findAncestorWithClass(this, BookSectionDateTimeValueIterator.class);
			pageContext.getOut().print(theBookSectionDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

