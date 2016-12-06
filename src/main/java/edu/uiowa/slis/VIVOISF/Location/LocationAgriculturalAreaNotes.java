package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationAgriculturalAreaNotesIterator theLocation = (LocationAgriculturalAreaNotesIterator)findAncestorWithClass(this, LocationAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theLocation.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

