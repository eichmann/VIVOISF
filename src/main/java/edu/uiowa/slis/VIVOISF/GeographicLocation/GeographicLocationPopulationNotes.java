package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationPopulationNotesIterator theGeographicLocation = (GeographicLocationPopulationNotesIterator)findAncestorWithClass(this, GeographicLocationPopulationNotesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

