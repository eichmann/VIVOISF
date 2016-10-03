package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionEditorIterator theBookSectionEditorIterator = (BookSectionEditorIterator)findAncestorWithClass(this, BookSectionEditorIterator.class);
			pageContext.getOut().print(theBookSectionEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for editor tag ");
		}
		return SKIP_BODY;
	}
}

