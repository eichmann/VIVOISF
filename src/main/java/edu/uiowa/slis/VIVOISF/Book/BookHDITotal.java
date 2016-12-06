package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookHDITotalIterator theBook = (BookHDITotalIterator)findAncestorWithClass(this, BookHDITotalIterator.class);
			pageContext.getOut().print(theBook.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

