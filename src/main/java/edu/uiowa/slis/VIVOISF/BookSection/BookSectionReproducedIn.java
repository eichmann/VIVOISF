package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionReproducedInIterator theBookSectionReproducedInIterator = (BookSectionReproducedInIterator)findAncestorWithClass(this, BookSectionReproducedInIterator.class);
			pageContext.getOut().print(theBookSectionReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

