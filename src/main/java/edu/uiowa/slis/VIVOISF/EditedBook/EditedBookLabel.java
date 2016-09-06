package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditedBook theEditedBook = (EditedBook)findAncestorWithClass(this, EditedBook.class);
			if (!theEditedBook.commitNeeded) {
				pageContext.getOut().print(theEditedBook.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EditedBook theEditedBook = (EditedBook)findAncestorWithClass(this, EditedBook.class);
			return theEditedBook.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditedBook for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EditedBook theEditedBook = (EditedBook)findAncestorWithClass(this, EditedBook.class);
			theEditedBook.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for label tag ");
		}
	}
}

