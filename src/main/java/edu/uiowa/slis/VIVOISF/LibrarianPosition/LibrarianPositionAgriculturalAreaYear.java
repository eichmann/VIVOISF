package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionAgriculturalAreaYearIterator theLibrarianPosition = (LibrarianPositionAgriculturalAreaYearIterator)findAncestorWithClass(this, LibrarianPositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

