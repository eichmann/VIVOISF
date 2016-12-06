package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionGDPUnitIterator theLibrarianPosition = (LibrarianPositionGDPUnitIterator)findAncestorWithClass(this, LibrarianPositionGDPUnitIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

