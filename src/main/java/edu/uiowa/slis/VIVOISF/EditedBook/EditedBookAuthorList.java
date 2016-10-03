package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookAuthorListIterator theEditedBookAuthorListIterator = (EditedBookAuthorListIterator)findAncestorWithClass(this, EditedBookAuthorListIterator.class);
			pageContext.getOut().print(theEditedBookAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for authorList tag ");
		}
		return SKIP_BODY;
	}
}

