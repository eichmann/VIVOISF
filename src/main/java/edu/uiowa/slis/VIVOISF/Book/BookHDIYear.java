package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHDIYearIterator theBook = (BookHDIYearIterator)findAncestorWithClass(this, BookHDIYearIterator.class);
			pageContext.getOut().print(theBook.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

