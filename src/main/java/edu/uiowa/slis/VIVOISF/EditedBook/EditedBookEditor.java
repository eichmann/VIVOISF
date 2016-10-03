package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookEditorIterator theEditedBookEditorIterator = (EditedBookEditorIterator)findAncestorWithClass(this, EditedBookEditorIterator.class);
			pageContext.getOut().print(theEditedBookEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for editor tag ");
		}
		return SKIP_BODY;
	}
}

