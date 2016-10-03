package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookPageStartIterator theEditedBook = (EditedBookPageStartIterator)findAncestorWithClass(this, EditedBookPageStartIterator.class);
			pageContext.getOut().print(theEditedBook.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

