package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPagesIterator theBookSection = (BookSectionPagesIterator)findAncestorWithClass(this, BookSectionPagesIterator.class);
			pageContext.getOut().print(theBookSection.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for pages tag ");
		}
		return SKIP_BODY;
	}
}

