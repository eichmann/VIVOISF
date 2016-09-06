package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookTheAbstractIterator theEditedBook = (EditedBookTheAbstractIterator)findAncestorWithClass(this, EditedBookTheAbstractIterator.class);
			pageContext.getOut().print(theEditedBook.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

