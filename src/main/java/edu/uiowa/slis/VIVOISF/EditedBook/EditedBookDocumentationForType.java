package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookDocumentationForIterator theEditedBookDocumentationForIterator = (EditedBookDocumentationForIterator)findAncestorWithClass(this, EditedBookDocumentationForIterator.class);
			pageContext.getOut().print(theEditedBookDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

