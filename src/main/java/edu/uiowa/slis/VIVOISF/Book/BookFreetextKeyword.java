package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(BookFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookFreetextKeywordIterator theBook = (BookFreetextKeywordIterator)findAncestorWithClass(this, BookFreetextKeywordIterator.class);
			pageContext.getOut().print(theBook.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

