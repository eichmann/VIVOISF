package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityFRIterator theBook = (BookNationalityFRIterator)findAncestorWithClass(this, BookNationalityFRIterator.class);
			pageContext.getOut().print(theBook.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

