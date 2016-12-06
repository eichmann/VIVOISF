package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCountryAreaTotalIterator theBook = (BookCountryAreaTotalIterator)findAncestorWithClass(this, BookCountryAreaTotalIterator.class);
			pageContext.getOut().print(theBook.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

