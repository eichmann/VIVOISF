package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationAgriculturalAreaNotesIterator theGeographicLocation = (GeographicLocationAgriculturalAreaNotesIterator)findAncestorWithClass(this, GeographicLocationAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

