package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNumPagesIterator theBookSection = (BookSectionNumPagesIterator)findAncestorWithClass(this, BookSectionNumPagesIterator.class);
			pageContext.getOut().print(theBookSection.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for numPages tag ");
		}
		return SKIP_BODY;
	}
}

