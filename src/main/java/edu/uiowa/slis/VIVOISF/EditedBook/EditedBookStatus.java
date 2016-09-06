package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookStatusIterator theEditedBookStatusIterator = (EditedBookStatusIterator)findAncestorWithClass(this, EditedBookStatusIterator.class);
			pageContext.getOut().print(theEditedBookStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for status tag ");
		}
		return SKIP_BODY;
	}
}

