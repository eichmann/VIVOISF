package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookEditorListIterator theEditedBookEditorListIterator = (EditedBookEditorListIterator)findAncestorWithClass(this, EditedBookEditorListIterator.class);
			pageContext.getOut().print(theEditedBookEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for editorList tag ");
		}
		return SKIP_BODY;
	}
}

