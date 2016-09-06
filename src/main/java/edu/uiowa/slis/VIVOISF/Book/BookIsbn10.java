package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookIsbn10Iterator theBook = (BookIsbn10Iterator)findAncestorWithClass(this, BookIsbn10Iterator.class);
			pageContext.getOut().print(theBook.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

