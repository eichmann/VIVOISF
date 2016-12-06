package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionLandAreaUnitIterator theLibrarianPosition = (LibrarianPositionLandAreaUnitIterator)findAncestorWithClass(this, LibrarianPositionLandAreaUnitIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

