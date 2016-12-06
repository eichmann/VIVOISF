package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListFRIterator theBook = (BookNameListFRIterator)findAncestorWithClass(this, BookNameListFRIterator.class);
			pageContext.getOut().print(theBook.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

