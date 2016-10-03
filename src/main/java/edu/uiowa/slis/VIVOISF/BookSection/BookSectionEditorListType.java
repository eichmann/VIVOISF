package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionEditorListIterator theBookSectionEditorListIterator = (BookSectionEditorListIterator)findAncestorWithClass(this, BookSectionEditorListIterator.class);
			pageContext.getOut().print(theBookSectionEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for editorList tag ");
		}
		return SKIP_BODY;
	}
}

