package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookAgriculturalAreaUnitIterator theBook = (BookAgriculturalAreaUnitIterator)findAncestorWithClass(this, BookAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theBook.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

