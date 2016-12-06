package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookAgriculturalAreaYearIterator theBook = (BookAgriculturalAreaYearIterator)findAncestorWithClass(this, BookAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theBook.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

