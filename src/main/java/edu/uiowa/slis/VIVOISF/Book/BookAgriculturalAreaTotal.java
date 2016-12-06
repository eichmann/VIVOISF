package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookAgriculturalAreaTotalIterator theBook = (BookAgriculturalAreaTotalIterator)findAncestorWithClass(this, BookAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theBook.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

