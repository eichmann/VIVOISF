package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookNumberIterator theEditedBook = (EditedBookNumberIterator)findAncestorWithClass(this, EditedBookNumberIterator.class);
			pageContext.getOut().print(theEditedBook.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for number tag ");
		}
		return SKIP_BODY;
	}
}

