package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSection currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionIterator theBook = (BookSectionIterator)findAncestorWithClass(this, BookSectionIterator.class);
			pageContext.getOut().print(theBook.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for section tag ");
		}
		return SKIP_BODY;
	}
}

