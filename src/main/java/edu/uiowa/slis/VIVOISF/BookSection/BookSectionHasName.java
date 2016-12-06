package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasNameIterator theBookSectionHasNameIterator = (BookSectionHasNameIterator)findAncestorWithClass(this, BookSectionHasNameIterator.class);
			pageContext.getOut().print(theBookSectionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasName tag ");
		}
		return SKIP_BODY;
	}
}

