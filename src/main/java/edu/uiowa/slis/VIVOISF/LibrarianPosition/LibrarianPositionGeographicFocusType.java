package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionGeographicFocusIterator theLibrarianPositionGeographicFocusIterator = (LibrarianPositionGeographicFocusIterator)findAncestorWithClass(this, LibrarianPositionGeographicFocusIterator.class);
			pageContext.getOut().print(theLibrarianPositionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

