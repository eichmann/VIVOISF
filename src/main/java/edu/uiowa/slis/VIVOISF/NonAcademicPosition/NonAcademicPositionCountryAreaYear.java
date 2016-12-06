package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCountryAreaYearIterator theNonAcademicPosition = (NonAcademicPositionCountryAreaYearIterator)findAncestorWithClass(this, NonAcademicPositionCountryAreaYearIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

