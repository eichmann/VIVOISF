package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionPopulationYearIterator theLibrarianPosition = (LibrarianPositionPopulationYearIterator)findAncestorWithClass(this, LibrarianPositionPopulationYearIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

