package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPopulationYearIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionPopulationYearIterator)findAncestorWithClass(this, FacultyAdministrativePositionPopulationYearIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

