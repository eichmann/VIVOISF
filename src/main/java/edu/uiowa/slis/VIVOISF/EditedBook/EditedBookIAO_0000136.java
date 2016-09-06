package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookIAO_0000136Iterator theEditedBookIAO_0000136Iterator = (EditedBookIAO_0000136Iterator)findAncestorWithClass(this, EditedBookIAO_0000136Iterator.class);
			pageContext.getOut().print(theEditedBookIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

