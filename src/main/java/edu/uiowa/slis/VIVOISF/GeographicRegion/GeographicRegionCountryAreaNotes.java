package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCountryAreaNotesIterator theGeographicRegion = (GeographicRegionCountryAreaNotesIterator)findAncestorWithClass(this, GeographicRegionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

