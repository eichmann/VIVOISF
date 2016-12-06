package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHDITotalIterator theLibrarianPosition = (LibrarianPositionHDITotalIterator)findAncestorWithClass(this, LibrarianPositionHDITotalIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

