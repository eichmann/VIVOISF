package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookSici currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookSiciIterator theEditedBook = (EditedBookSiciIterator)findAncestorWithClass(this, EditedBookSiciIterator.class);
			pageContext.getOut().print(theEditedBook.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for sici tag ");
		}
		return SKIP_BODY;
	}
}

