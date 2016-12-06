package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityESIterator theBook = (BookNationalityESIterator)findAncestorWithClass(this, BookNationalityESIterator.class);
			pageContext.getOut().print(theBook.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

