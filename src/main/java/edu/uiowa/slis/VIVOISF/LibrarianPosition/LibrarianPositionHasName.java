package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasNameIterator theLibrarianPositionHasNameIterator = (LibrarianPositionHasNameIterator)findAncestorWithClass(this, LibrarianPositionHasNameIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

