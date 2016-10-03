package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookHandleIterator theEditedBook = (EditedBookHandleIterator)findAncestorWithClass(this, EditedBookHandleIterator.class);
			pageContext.getOut().print(theEditedBook.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for handle tag ");
		}
		return SKIP_BODY;
	}
}

