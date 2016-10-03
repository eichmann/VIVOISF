package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookGtin14Iterator theEditedBook = (EditedBookGtin14Iterator)findAncestorWithClass(this, EditedBookGtin14Iterator.class);
			pageContext.getOut().print(theEditedBook.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

