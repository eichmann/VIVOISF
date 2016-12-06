package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionLandAreaTotalIterator theLibrarianPosition = (LibrarianPositionLandAreaTotalIterator)findAncestorWithClass(this, LibrarianPositionLandAreaTotalIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

