package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListITIterator theBook = (BookNameListITIterator)findAncestorWithClass(this, BookNameListITIterator.class);
			pageContext.getOut().print(theBook.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

