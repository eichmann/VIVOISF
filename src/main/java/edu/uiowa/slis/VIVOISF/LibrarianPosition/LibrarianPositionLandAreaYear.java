package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionLandAreaYearIterator theLibrarianPosition = (LibrarianPositionLandAreaYearIterator)findAncestorWithClass(this, LibrarianPositionLandAreaYearIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

