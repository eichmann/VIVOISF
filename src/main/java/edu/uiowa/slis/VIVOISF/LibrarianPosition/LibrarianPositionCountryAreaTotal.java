package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCountryAreaTotalIterator theLibrarianPosition = (LibrarianPositionCountryAreaTotalIterator)findAncestorWithClass(this, LibrarianPositionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

