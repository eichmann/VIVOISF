package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHasMinLongitudeIterator theBook = (BookHasMinLongitudeIterator)findAncestorWithClass(this, BookHasMinLongitudeIterator.class);
			pageContext.getOut().print(theBook.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

