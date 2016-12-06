package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCountryAreaYearIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCountryAreaYearIterator)findAncestorWithClass(this, FacultyAdministrativePositionCountryAreaYearIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

