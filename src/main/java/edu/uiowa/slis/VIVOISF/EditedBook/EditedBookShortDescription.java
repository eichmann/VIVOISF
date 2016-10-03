package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookShortDescriptionIterator theEditedBook = (EditedBookShortDescriptionIterator)findAncestorWithClass(this, EditedBookShortDescriptionIterator.class);
			pageContext.getOut().print(theEditedBook.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

