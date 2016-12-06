package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionRelatedByIterator theBookSectionRelatedByIterator = (BookSectionRelatedByIterator)findAncestorWithClass(this, BookSectionRelatedByIterator.class);
			pageContext.getOut().print(theBookSectionRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

