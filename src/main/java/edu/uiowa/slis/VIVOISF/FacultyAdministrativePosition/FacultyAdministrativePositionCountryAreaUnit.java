package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCountryAreaUnitIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCountryAreaUnitIterator)findAncestorWithClass(this, FacultyAdministrativePositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

