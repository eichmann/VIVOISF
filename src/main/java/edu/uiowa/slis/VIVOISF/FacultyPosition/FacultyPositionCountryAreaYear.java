package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCountryAreaYearIterator theFacultyPosition = (FacultyPositionCountryAreaYearIterator)findAncestorWithClass(this, FacultyPositionCountryAreaYearIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

