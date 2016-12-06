package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasURLIterator theLibrarianPositionHasURLIterator = (LibrarianPositionHasURLIterator)findAncestorWithClass(this, LibrarianPositionHasURLIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

