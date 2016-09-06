package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionReproducesIterator theBookSectionReproducesIterator = (BookSectionReproducesIterator)findAncestorWithClass(this, BookSectionReproducesIterator.class);
			pageContext.getOut().print(theBookSectionReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

