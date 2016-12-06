package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationPopulationNotesIterator theLocation = (LocationPopulationNotesIterator)findAncestorWithClass(this, LocationPopulationNotesIterator.class);
			pageContext.getOut().print(theLocation.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

