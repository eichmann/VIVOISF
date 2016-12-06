package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationLandAreaNotesIterator theLocation = (LocationLandAreaNotesIterator)findAncestorWithClass(this, LocationLandAreaNotesIterator.class);
			pageContext.getOut().print(theLocation.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

