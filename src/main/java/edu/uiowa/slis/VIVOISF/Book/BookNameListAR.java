package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListARIterator theBook = (BookNameListARIterator)findAncestorWithClass(this, BookNameListARIterator.class);
			pageContext.getOut().print(theBook.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

