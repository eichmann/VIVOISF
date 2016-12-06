package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPopulationUnitIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionPopulationUnitIterator)findAncestorWithClass(this, FacultyAdministrativePositionPopulationUnitIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

