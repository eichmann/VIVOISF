package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookGDPYearIterator theBook = (BookGDPYearIterator)findAncestorWithClass(this, BookGDPYearIterator.class);
			pageContext.getOut().print(theBook.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

