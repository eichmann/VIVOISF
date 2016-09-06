package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookReproducesIterator theEditedBookReproducesIterator = (EditedBookReproducesIterator)findAncestorWithClass(this, EditedBookReproducesIterator.class);
			pageContext.getOut().print(theEditedBookReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

