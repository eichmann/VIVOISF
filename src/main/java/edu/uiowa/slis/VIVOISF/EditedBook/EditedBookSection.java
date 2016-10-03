package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookSection currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookSectionIterator theEditedBook = (EditedBookSectionIterator)findAncestorWithClass(this, EditedBookSectionIterator.class);
			pageContext.getOut().print(theEditedBook.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for section tag ");
		}
		return SKIP_BODY;
	}
}

