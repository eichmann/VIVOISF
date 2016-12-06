package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionPopulationUnitIterator theLibrarianPosition = (LibrarianPositionPopulationUnitIterator)findAncestorWithClass(this, LibrarianPositionPopulationUnitIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

