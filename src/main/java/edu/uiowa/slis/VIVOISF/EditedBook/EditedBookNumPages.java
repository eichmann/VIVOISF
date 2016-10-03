package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookNumPagesIterator theEditedBook = (EditedBookNumPagesIterator)findAncestorWithClass(this, EditedBookNumPagesIterator.class);
			pageContext.getOut().print(theEditedBook.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for numPages tag ");
		}
		return SKIP_BODY;
	}
}

