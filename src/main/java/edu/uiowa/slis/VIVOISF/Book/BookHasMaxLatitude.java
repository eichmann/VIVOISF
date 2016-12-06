package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHasMaxLatitudeIterator theBook = (BookHasMaxLatitudeIterator)findAncestorWithClass(this, BookHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theBook.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

