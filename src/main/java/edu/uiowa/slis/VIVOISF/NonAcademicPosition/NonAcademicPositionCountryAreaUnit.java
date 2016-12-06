package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCountryAreaUnitIterator theNonAcademicPosition = (NonAcademicPositionCountryAreaUnitIterator)findAncestorWithClass(this, NonAcademicPositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

