package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityRUIterator theBook = (BookNationalityRUIterator)findAncestorWithClass(this, BookNationalityRUIterator.class);
			pageContext.getOut().print(theBook.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

