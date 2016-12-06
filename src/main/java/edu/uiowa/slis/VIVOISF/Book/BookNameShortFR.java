package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortFRIterator theBook = (BookNameShortFRIterator)findAncestorWithClass(this, BookNameShortFRIterator.class);
			pageContext.getOut().print(theBook.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

