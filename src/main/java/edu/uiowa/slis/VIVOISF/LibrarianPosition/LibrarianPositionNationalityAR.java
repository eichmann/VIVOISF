package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityARIterator theLibrarianPosition = (LibrarianPositionNationalityARIterator)findAncestorWithClass(this, LibrarianPositionNationalityARIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

