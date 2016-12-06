package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationGDPNotesIterator theGeographicLocation = (GeographicLocationGDPNotesIterator)findAncestorWithClass(this, GeographicLocationGDPNotesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

