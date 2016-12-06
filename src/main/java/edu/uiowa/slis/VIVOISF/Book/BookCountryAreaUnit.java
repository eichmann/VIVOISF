package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCountryAreaUnitIterator theBook = (BookCountryAreaUnitIterator)findAncestorWithClass(this, BookCountryAreaUnitIterator.class);
			pageContext.getOut().print(theBook.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

