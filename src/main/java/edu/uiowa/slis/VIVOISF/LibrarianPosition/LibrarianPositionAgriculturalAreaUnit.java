package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionAgriculturalAreaUnitIterator theLibrarianPosition = (LibrarianPositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, LibrarianPositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

