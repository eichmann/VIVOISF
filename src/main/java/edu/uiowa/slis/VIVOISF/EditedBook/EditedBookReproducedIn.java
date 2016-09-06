package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookReproducedInIterator theEditedBookReproducedInIterator = (EditedBookReproducedInIterator)findAncestorWithClass(this, EditedBookReproducedInIterator.class);
			pageContext.getOut().print(theEditedBookReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

