package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookIdentifierIterator theEditedBook = (EditedBookIdentifierIterator)findAncestorWithClass(this, EditedBookIdentifierIterator.class);
			pageContext.getOut().print(theEditedBook.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for identifier tag ");
		}
		return SKIP_BODY;
	}
}

