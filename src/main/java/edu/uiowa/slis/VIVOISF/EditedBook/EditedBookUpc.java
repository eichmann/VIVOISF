package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookUpcIterator theEditedBook = (EditedBookUpcIterator)findAncestorWithClass(this, EditedBookUpcIterator.class);
			pageContext.getOut().print(theEditedBook.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for upc tag ");
		}
		return SKIP_BODY;
	}
}

