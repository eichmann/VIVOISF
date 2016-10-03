package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BookEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookEditorListIterator theBookEditorListIterator = (BookEditorListIterator)findAncestorWithClass(this, BookEditorListIterator.class);
			pageContext.getOut().print(theBookEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for editorList tag ");
		}
		return SKIP_BODY;
	}
}

