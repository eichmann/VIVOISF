package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookReproducedInIterator theEditedBookReproducedInIterator = (EditedBookReproducedInIterator)findAncestorWithClass(this, EditedBookReproducedInIterator.class);
			pageContext.getOut().print(theEditedBookReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

