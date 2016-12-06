package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationGDPNotesIterator theLocation = (LocationGDPNotesIterator)findAncestorWithClass(this, LocationGDPNotesIterator.class);
			pageContext.getOut().print(theLocation.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

