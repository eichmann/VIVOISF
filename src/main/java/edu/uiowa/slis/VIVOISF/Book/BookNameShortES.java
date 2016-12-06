package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortESIterator theBook = (BookNameShortESIterator)findAncestorWithClass(this, BookNameShortESIterator.class);
			pageContext.getOut().print(theBook.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

