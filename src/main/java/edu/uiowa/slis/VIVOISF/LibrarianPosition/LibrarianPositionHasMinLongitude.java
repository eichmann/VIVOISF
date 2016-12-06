package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasMinLongitudeIterator theLibrarianPosition = (LibrarianPositionHasMinLongitudeIterator)findAncestorWithClass(this, LibrarianPositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

