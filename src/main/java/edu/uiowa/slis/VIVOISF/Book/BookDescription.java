package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BookDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookDescriptionIterator theBook = (BookDescriptionIterator)findAncestorWithClass(this, BookDescriptionIterator.class);
			pageContext.getOut().print(theBook.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for description tag ");
		}
		return SKIP_BODY;
	}
}

