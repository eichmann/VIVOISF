package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookLandAreaTotalIterator theBook = (BookLandAreaTotalIterator)findAncestorWithClass(this, BookLandAreaTotalIterator.class);
			pageContext.getOut().print(theBook.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

