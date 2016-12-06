package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasSubjectAreaIterator theBookHasSubjectAreaIterator = (BookHasSubjectAreaIterator)findAncestorWithClass(this, BookHasSubjectAreaIterator.class);
			pageContext.getOut().print(theBookHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

