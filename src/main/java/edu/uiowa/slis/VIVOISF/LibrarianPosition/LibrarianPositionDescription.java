package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionDescriptionIterator theLibrarianPosition = (LibrarianPositionDescriptionIterator)findAncestorWithClass(this, LibrarianPositionDescriptionIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for description tag ");
		}
		return SKIP_BODY;
	}
}

