package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookOclcnumIterator theEditedBook = (EditedBookOclcnumIterator)findAncestorWithClass(this, EditedBookOclcnumIterator.class);
			pageContext.getOut().print(theEditedBook.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

