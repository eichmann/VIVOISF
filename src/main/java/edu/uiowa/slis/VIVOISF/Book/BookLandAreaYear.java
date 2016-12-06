package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookLandAreaYearIterator theBook = (BookLandAreaYearIterator)findAncestorWithClass(this, BookLandAreaYearIterator.class);
			pageContext.getOut().print(theBook.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

