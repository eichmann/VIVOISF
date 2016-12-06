package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHasMaxLongitudeIterator theBook = (BookHasMaxLongitudeIterator)findAncestorWithClass(this, BookHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theBook.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

