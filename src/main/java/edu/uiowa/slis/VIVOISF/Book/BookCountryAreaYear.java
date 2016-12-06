package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCountryAreaYearIterator theBook = (BookCountryAreaYearIterator)findAncestorWithClass(this, BookCountryAreaYearIterator.class);
			pageContext.getOut().print(theBook.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

