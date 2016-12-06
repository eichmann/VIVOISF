package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookGDPUnitIterator theBook = (BookGDPUnitIterator)findAncestorWithClass(this, BookGDPUnitIterator.class);
			pageContext.getOut().print(theBook.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

