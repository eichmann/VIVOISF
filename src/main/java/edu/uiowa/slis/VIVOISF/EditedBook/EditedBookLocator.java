package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookLocatorIterator theEditedBook = (EditedBookLocatorIterator)findAncestorWithClass(this, EditedBookLocatorIterator.class);
			pageContext.getOut().print(theEditedBook.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for locator tag ");
		}
		return SKIP_BODY;
	}
}

