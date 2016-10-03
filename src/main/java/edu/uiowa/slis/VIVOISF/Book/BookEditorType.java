package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookEditorIterator theBookEditorIterator = (BookEditorIterator)findAncestorWithClass(this, BookEditorIterator.class);
			pageContext.getOut().print(theBookEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for editor tag ");
		}
		return SKIP_BODY;
	}
}

