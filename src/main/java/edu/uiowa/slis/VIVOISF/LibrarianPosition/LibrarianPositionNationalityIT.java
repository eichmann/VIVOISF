package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityITIterator theLibrarianPosition = (LibrarianPositionNationalityITIterator)findAncestorWithClass(this, LibrarianPositionNationalityITIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

