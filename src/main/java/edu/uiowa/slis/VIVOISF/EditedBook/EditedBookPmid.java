package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookPmidIterator theEditedBook = (EditedBookPmidIterator)findAncestorWithClass(this, EditedBookPmidIterator.class);
			pageContext.getOut().print(theEditedBook.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for pmid tag ");
		}
		return SKIP_BODY;
	}
}

