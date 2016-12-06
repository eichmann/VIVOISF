package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHasMinLatitudeIterator theBook = (BookHasMinLatitudeIterator)findAncestorWithClass(this, BookHasMinLatitudeIterator.class);
			pageContext.getOut().print(theBook.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

