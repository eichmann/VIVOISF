package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookIsbn10Iterator theEditedBook = (EditedBookIsbn10Iterator)findAncestorWithClass(this, EditedBookIsbn10Iterator.class);
			pageContext.getOut().print(theEditedBook.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

