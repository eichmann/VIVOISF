package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionAgriculturalAreaTotalIterator theLibrarianPosition = (LibrarianPositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, LibrarianPositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

