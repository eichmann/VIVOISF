package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCountryAreaTotalIterator theFacultyPosition = (FacultyPositionCountryAreaTotalIterator)findAncestorWithClass(this, FacultyPositionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

