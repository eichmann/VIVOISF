package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasEmailIterator theLibrarianPositionHasEmailIterator = (LibrarianPositionHasEmailIterator)findAncestorWithClass(this, LibrarianPositionHasEmailIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

