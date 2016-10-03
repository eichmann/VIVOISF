package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookOwnerIterator theEditedBookOwnerIterator = (EditedBookOwnerIterator)findAncestorWithClass(this, EditedBookOwnerIterator.class);
			pageContext.getOut().print(theEditedBookOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for owner tag ");
		}
		return SKIP_BODY;
	}
}

