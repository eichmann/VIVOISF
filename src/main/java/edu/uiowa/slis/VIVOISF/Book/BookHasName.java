package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasNameIterator theBookHasNameIterator = (BookHasNameIterator)findAncestorWithClass(this, BookHasNameIterator.class);
			pageContext.getOut().print(theBookHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasName tag ");
		}
		return SKIP_BODY;
	}
}

