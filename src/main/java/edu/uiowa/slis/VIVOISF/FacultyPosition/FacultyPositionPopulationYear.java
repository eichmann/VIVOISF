package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPopulationYearIterator theFacultyPosition = (FacultyPositionPopulationYearIterator)findAncestorWithClass(this, FacultyPositionPopulationYearIterator.class);
			pageContext.getOut().print(theFacultyPosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

