package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookDoiIterator theEditedBook = (EditedBookDoiIterator)findAncestorWithClass(this, EditedBookDoiIterator.class);
			pageContext.getOut().print(theEditedBook.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for doi tag ");
		}
		return SKIP_BODY;
	}
}

