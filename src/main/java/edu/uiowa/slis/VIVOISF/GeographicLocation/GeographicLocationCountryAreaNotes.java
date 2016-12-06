package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCountryAreaNotesIterator theGeographicLocation = (GeographicLocationCountryAreaNotesIterator)findAncestorWithClass(this, GeographicLocationCountryAreaNotesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

