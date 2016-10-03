package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionShortTitleIterator theBookSection = (BookSectionShortTitleIterator)findAncestorWithClass(this, BookSectionShortTitleIterator.class);
			pageContext.getOut().print(theBookSection.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

