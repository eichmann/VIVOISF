package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasURLIterator theBookSectionHasURLIterator = (BookSectionHasURLIterator)findAncestorWithClass(this, BookSectionHasURLIterator.class);
			pageContext.getOut().print(theBookSectionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

