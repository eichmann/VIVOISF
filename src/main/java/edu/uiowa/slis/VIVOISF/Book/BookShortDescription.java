package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BookShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookShortDescriptionIterator theBook = (BookShortDescriptionIterator)findAncestorWithClass(this, BookShortDescriptionIterator.class);
			pageContext.getOut().print(theBook.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

