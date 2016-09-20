package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditedBookERO_0000045Iterator theEditedBook = (EditedBookERO_0000045Iterator)findAncestorWithClass(this, EditedBookERO_0000045Iterator.class);
			pageContext.getOut().print(theEditedBook.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

