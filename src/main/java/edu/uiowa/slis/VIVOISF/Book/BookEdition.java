package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(BookEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookEditionIterator theBook = (BookEditionIterator)findAncestorWithClass(this, BookEditionIterator.class);
			pageContext.getOut().print(theBook.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for edition tag ");
		}
		return SKIP_BODY;
	}
}

