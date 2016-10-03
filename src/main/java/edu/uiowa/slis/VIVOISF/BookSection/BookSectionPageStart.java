package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPageStartIterator theBookSection = (BookSectionPageStartIterator)findAncestorWithClass(this, BookSectionPageStartIterator.class);
			pageContext.getOut().print(theBookSection.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

