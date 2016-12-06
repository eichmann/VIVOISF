package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPopulationUnitIterator theFacultyPosition = (FacultyPositionPopulationUnitIterator)findAncestorWithClass(this, FacultyPositionPopulationUnitIterator.class);
			pageContext.getOut().print(theFacultyPosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

