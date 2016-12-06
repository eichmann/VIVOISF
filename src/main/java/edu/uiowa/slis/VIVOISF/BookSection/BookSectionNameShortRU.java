package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameShortRUIterator theBookSection = (BookSectionNameShortRUIterator)findAncestorWithClass(this, BookSectionNameShortRUIterator.class);
			pageContext.getOut().print(theBookSection.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

