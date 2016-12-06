package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityITIterator theBook = (BookNationalityITIterator)findAncestorWithClass(this, BookNationalityITIterator.class);
			pageContext.getOut().print(theBook.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

