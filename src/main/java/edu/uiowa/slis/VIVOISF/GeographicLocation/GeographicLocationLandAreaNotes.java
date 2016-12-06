package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationLandAreaNotesIterator theGeographicLocation = (GeographicLocationLandAreaNotesIterator)findAncestorWithClass(this, GeographicLocationLandAreaNotesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

