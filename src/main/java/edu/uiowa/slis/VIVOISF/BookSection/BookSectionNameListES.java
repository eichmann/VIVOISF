package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameListESIterator theBookSection = (BookSectionNameListESIterator)findAncestorWithClass(this, BookSectionNameListESIterator.class);
			pageContext.getOut().print(theBookSection.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

