package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookRO_0000056Iterator theEditedBookRO_0000056Iterator = (EditedBookRO_0000056Iterator)findAncestorWithClass(this, EditedBookRO_0000056Iterator.class);
			pageContext.getOut().print(theEditedBookRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

