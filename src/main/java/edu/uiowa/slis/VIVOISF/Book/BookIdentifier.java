package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(BookIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookIdentifierIterator theBook = (BookIdentifierIterator)findAncestorWithClass(this, BookIdentifierIterator.class);
			pageContext.getOut().print(theBook.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for identifier tag ");
		}
		return SKIP_BODY;
	}
}

