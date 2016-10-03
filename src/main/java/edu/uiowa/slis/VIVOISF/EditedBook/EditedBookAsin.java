package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookAsinIterator theEditedBook = (EditedBookAsinIterator)findAncestorWithClass(this, EditedBookAsinIterator.class);
			pageContext.getOut().print(theEditedBook.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for asin tag ");
		}
		return SKIP_BODY;
	}
}

