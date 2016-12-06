package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCountryAreaNotesIterator theLocation = (LocationCountryAreaNotesIterator)findAncestorWithClass(this, LocationCountryAreaNotesIterator.class);
			pageContext.getOut().print(theLocation.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

