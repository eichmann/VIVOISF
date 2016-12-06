package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGDPNotesIterator theGeographicRegion = (GeographicRegionGDPNotesIterator)findAncestorWithClass(this, GeographicRegionGDPNotesIterator.class);
			pageContext.getOut().print(theGeographicRegion.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

