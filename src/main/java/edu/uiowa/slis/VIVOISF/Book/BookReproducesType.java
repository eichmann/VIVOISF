package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookReproducesIterator theBookReproducesIterator = (BookReproducesIterator)findAncestorWithClass(this, BookReproducesIterator.class);
			pageContext.getOut().print(theBookReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

