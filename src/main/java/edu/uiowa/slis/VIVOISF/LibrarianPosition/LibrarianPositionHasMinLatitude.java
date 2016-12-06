package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasMinLatitudeIterator theLibrarianPosition = (LibrarianPositionHasMinLatitudeIterator)findAncestorWithClass(this, LibrarianPositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

