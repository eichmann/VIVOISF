package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BookDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookDoiIterator theBook = (BookDoiIterator)findAncestorWithClass(this, BookDoiIterator.class);
			pageContext.getOut().print(theBook.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for doi tag ");
		}
		return SKIP_BODY;
	}
}

