package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookCodenIterator theEditedBook = (EditedBookCodenIterator)findAncestorWithClass(this, EditedBookCodenIterator.class);
			pageContext.getOut().print(theEditedBook.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for coden tag ");
		}
		return SKIP_BODY;
	}
}

