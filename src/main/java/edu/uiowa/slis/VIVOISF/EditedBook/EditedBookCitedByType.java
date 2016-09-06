package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookCitedByIterator theEditedBookCitedByIterator = (EditedBookCitedByIterator)findAncestorWithClass(this, EditedBookCitedByIterator.class);
			pageContext.getOut().print(theEditedBookCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

