package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPmidIterator theBook = (BookPmidIterator)findAncestorWithClass(this, BookPmidIterator.class);
			pageContext.getOut().print(theBook.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for pmid tag ");
		}
		return SKIP_BODY;
	}
}

