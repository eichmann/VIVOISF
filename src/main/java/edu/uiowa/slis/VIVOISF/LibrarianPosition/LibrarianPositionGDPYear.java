package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionGDPYearIterator theLibrarianPosition = (LibrarianPositionGDPYearIterator)findAncestorWithClass(this, LibrarianPositionGDPYearIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

