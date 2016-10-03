package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(BookOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookOclcnumIterator theBook = (BookOclcnumIterator)findAncestorWithClass(this, BookOclcnumIterator.class);
			pageContext.getOut().print(theBook.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

