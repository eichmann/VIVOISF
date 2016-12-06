package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionRelatedByIterator theBookSectionRelatedByIterator = (BookSectionRelatedByIterator)findAncestorWithClass(this, BookSectionRelatedByIterator.class);
			pageContext.getOut().print(theBookSectionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

