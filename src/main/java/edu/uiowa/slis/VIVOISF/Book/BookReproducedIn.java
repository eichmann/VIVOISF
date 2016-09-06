package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(BookReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookReproducedInIterator theBookReproducedInIterator = (BookReproducedInIterator)findAncestorWithClass(this, BookReproducedInIterator.class);
			pageContext.getOut().print(theBookReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

