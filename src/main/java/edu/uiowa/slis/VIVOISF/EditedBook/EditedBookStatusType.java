package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookStatusIterator theEditedBookStatusIterator = (EditedBookStatusIterator)findAncestorWithClass(this, EditedBookStatusIterator.class);
			pageContext.getOut().print(theEditedBookStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for status tag ");
		}
		return SKIP_BODY;
	}
}

