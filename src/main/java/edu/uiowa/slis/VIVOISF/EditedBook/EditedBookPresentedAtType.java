package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookPresentedAtIterator theEditedBookPresentedAtIterator = (EditedBookPresentedAtIterator)findAncestorWithClass(this, EditedBookPresentedAtIterator.class);
			pageContext.getOut().print(theEditedBookPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

