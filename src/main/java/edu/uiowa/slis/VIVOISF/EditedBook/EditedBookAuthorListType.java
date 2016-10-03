package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookAuthorListIterator theEditedBookAuthorListIterator = (EditedBookAuthorListIterator)findAncestorWithClass(this, EditedBookAuthorListIterator.class);
			pageContext.getOut().print(theEditedBookAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for authorList tag ");
		}
		return SKIP_BODY;
	}
}

