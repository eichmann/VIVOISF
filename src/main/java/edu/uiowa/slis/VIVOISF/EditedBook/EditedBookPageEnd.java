package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookPageEndIterator theEditedBook = (EditedBookPageEndIterator)findAncestorWithClass(this, EditedBookPageEndIterator.class);
			pageContext.getOut().print(theEditedBook.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

