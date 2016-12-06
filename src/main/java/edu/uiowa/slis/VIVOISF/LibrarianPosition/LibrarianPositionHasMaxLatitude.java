package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasMaxLatitudeIterator theLibrarianPosition = (LibrarianPositionHasMaxLatitudeIterator)findAncestorWithClass(this, LibrarianPositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

