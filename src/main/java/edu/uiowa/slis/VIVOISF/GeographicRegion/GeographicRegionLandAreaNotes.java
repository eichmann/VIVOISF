package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionLandAreaNotesIterator theGeographicRegion = (GeographicRegionLandAreaNotesIterator)findAncestorWithClass(this, GeographicRegionLandAreaNotesIterator.class);
			pageContext.getOut().print(theGeographicRegion.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

