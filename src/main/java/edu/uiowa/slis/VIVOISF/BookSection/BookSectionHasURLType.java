package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasURLIterator theBookSectionHasURLIterator = (BookSectionHasURLIterator)findAncestorWithClass(this, BookSectionHasURLIterator.class);
			pageContext.getOut().print(theBookSectionHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

