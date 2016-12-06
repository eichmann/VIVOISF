package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPopulationTotalIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionPopulationTotalIterator)findAncestorWithClass(this, FacultyAdministrativePositionPopulationTotalIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

