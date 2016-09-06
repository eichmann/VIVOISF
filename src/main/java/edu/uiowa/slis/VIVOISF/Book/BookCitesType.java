package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookCitesIterator theBookCitesIterator = (BookCitesIterator)findAncestorWithClass(this, BookCitesIterator.class);
			pageContext.getOut().print(theBookCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for cites tag ");
		}
		return SKIP_BODY;
	}
}

