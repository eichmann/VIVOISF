package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookContent currentInstance = null;
	private static final Log log = LogFactory.getLog(BookContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookContentIterator theBook = (BookContentIterator)findAncestorWithClass(this, BookContentIterator.class);
			pageContext.getOut().print(theBook.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for content tag ");
		}
		return SKIP_BODY;
	}
}

