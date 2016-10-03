package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHandleIterator theBook = (BookHandleIterator)findAncestorWithClass(this, BookHandleIterator.class);
			pageContext.getOut().print(theBook.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for handle tag ");
		}
		return SKIP_BODY;
	}
}

