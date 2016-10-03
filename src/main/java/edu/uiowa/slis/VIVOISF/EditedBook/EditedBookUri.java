package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookUri currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookUriIterator theEditedBook = (EditedBookUriIterator)findAncestorWithClass(this, EditedBookUriIterator.class);
			pageContext.getOut().print(theEditedBook.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for uri tag ");
		}
		return SKIP_BODY;
	}
}

