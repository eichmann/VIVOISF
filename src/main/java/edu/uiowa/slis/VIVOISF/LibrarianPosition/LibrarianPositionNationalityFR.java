package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityFRIterator theLibrarianPosition = (LibrarianPositionNationalityFRIterator)findAncestorWithClass(this, LibrarianPositionNationalityFRIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

