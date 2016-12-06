package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionPopulationTotalIterator theNonAcademicPosition = (NonAcademicPositionPopulationTotalIterator)findAncestorWithClass(this, NonAcademicPositionPopulationTotalIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

