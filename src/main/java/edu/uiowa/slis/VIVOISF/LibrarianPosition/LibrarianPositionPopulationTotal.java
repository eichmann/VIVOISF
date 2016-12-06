package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionPopulationTotalIterator theLibrarianPosition = (LibrarianPositionPopulationTotalIterator)findAncestorWithClass(this, LibrarianPositionPopulationTotalIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

