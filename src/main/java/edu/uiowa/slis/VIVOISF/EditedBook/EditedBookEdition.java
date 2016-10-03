package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookEditionIterator theEditedBook = (EditedBookEditionIterator)findAncestorWithClass(this, EditedBookEditionIterator.class);
			pageContext.getOut().print(theEditedBook.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for edition tag ");
		}
		return SKIP_BODY;
	}
}

