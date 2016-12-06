package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCountryAreaYearIterator theLibrarianPosition = (LibrarianPositionCountryAreaYearIterator)findAncestorWithClass(this, LibrarianPositionCountryAreaYearIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

