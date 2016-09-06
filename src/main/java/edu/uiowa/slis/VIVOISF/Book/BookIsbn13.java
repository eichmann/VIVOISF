package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookIsbn13Iterator theBook = (BookIsbn13Iterator)findAncestorWithClass(this, BookIsbn13Iterator.class);
			pageContext.getOut().print(theBook.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

