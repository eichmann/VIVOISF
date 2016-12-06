package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCountryAreaUnitIterator theLibrarianPosition = (LibrarianPositionCountryAreaUnitIterator)findAncestorWithClass(this, LibrarianPositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

