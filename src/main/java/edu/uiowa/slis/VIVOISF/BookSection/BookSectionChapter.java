package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionChapter extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionChapter currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionChapter.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionChapterIterator theBookSection = (BookSectionChapterIterator)findAncestorWithClass(this, BookSectionChapterIterator.class);
			pageContext.getOut().print(theBookSection.getChapter());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for chapter tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for chapter tag ");
		}
		return SKIP_BODY;
	}
}

