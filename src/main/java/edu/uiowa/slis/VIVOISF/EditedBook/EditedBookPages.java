package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookPages currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookPagesIterator theEditedBook = (EditedBookPagesIterator)findAncestorWithClass(this, EditedBookPagesIterator.class);
			pageContext.getOut().print(theEditedBook.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for pages tag ");
		}
		return SKIP_BODY;
	}
}

