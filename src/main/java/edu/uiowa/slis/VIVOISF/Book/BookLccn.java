package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(BookLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookLccnIterator theBook = (BookLccnIterator)findAncestorWithClass(this, BookLccnIterator.class);
			pageContext.getOut().print(theBook.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for lccn tag ");
		}
		return SKIP_BODY;
	}
}

