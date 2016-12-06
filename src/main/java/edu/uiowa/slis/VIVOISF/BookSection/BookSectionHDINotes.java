package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHDINotesIterator theBookSection = (BookSectionHDINotesIterator)findAncestorWithClass(this, BookSectionHDINotesIterator.class);
			pageContext.getOut().print(theBookSection.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

