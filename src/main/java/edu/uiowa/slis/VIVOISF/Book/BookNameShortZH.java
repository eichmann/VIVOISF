package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortZHIterator theBook = (BookNameShortZHIterator)findAncestorWithClass(this, BookNameShortZHIterator.class);
			pageContext.getOut().print(theBook.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

