package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookCitedByIterator theBookCitedByIterator = (BookCitedByIterator)findAncestorWithClass(this, BookCitedByIterator.class);
			pageContext.getOut().print(theBookCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

