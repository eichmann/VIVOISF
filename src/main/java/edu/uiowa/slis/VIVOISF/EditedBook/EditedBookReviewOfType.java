package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookReviewOfIterator theEditedBookReviewOfIterator = (EditedBookReviewOfIterator)findAncestorWithClass(this, EditedBookReviewOfIterator.class);
			pageContext.getOut().print(theEditedBookReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

