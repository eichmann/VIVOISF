package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPopulationTotalIterator theFacultyPosition = (FacultyPositionPopulationTotalIterator)findAncestorWithClass(this, FacultyPositionPopulationTotalIterator.class);
			pageContext.getOut().print(theFacultyPosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

