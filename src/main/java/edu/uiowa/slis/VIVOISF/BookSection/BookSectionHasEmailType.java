package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasEmailIterator theBookSectionHasEmailIterator = (BookSectionHasEmailIterator)findAncestorWithClass(this, BookSectionHasEmailIterator.class);
			pageContext.getOut().print(theBookSectionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

