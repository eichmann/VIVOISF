package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookContent currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookContentIterator theEditedBook = (EditedBookContentIterator)findAncestorWithClass(this, EditedBookContentIterator.class);
			pageContext.getOut().print(theEditedBook.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for content tag ");
		}
		return SKIP_BODY;
	}
}

