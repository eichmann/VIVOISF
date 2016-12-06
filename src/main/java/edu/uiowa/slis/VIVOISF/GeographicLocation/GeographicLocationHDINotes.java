package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHDINotesIterator theGeographicLocation = (GeographicLocationHDINotesIterator)findAncestorWithClass(this, GeographicLocationHDINotesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

