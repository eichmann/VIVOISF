package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortARIterator theBook = (BookNameShortARIterator)findAncestorWithClass(this, BookNameShortARIterator.class);
			pageContext.getOut().print(theBook.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

