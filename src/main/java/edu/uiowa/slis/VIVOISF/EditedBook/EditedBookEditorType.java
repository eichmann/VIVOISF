package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookEditorIterator theEditedBookEditorIterator = (EditedBookEditorIterator)findAncestorWithClass(this, EditedBookEditorIterator.class);
			pageContext.getOut().print(theEditedBookEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for editor tag ");
		}
		return SKIP_BODY;
	}
}

