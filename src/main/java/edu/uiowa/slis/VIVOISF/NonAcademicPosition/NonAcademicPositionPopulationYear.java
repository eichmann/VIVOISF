package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionPopulationYearIterator theNonAcademicPosition = (NonAcademicPositionPopulationYearIterator)findAncestorWithClass(this, NonAcademicPositionPopulationYearIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

