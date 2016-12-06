package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHDIYearIterator theLibrarianPosition = (LibrarianPositionHDIYearIterator)findAncestorWithClass(this, LibrarianPositionHDIYearIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

