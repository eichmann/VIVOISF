package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookDocumentationForIterator theEditedBookDocumentationForIterator = (EditedBookDocumentationForIterator)findAncestorWithClass(this, EditedBookDocumentationForIterator.class);
			pageContext.getOut().print(theEditedBookDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

