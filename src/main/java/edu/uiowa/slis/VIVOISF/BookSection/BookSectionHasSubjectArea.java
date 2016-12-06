package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasSubjectAreaIterator theBookSectionHasSubjectAreaIterator = (BookSectionHasSubjectAreaIterator)findAncestorWithClass(this, BookSectionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theBookSectionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

