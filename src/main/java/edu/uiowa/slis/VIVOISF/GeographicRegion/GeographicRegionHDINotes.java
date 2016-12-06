package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHDINotesIterator theGeographicRegion = (GeographicRegionHDINotesIterator)findAncestorWithClass(this, GeographicRegionHDINotesIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

