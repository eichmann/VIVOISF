package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCountryAreaTotalIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCountryAreaTotalIterator)findAncestorWithClass(this, FacultyAdministrativePositionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

