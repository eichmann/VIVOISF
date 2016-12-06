package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasMaxLongitudeIterator theLibrarianPosition = (LibrarianPositionHasMaxLongitudeIterator)findAncestorWithClass(this, LibrarianPositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

