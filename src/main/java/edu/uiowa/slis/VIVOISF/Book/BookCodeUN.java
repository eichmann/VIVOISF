package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeUNIterator theBook = (BookCodeUNIterator)findAncestorWithClass(this, BookCodeUNIterator.class);
			pageContext.getOut().print(theBook.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

