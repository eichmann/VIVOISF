package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookCitesIterator theEditedBookCitesIterator = (EditedBookCitesIterator)findAncestorWithClass(this, EditedBookCitesIterator.class);
			pageContext.getOut().print(theEditedBookCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for cites tag ");
		}
		return SKIP_BODY;
	}
}

