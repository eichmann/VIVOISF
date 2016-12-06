package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionLandAreaYearIterator theGeographicRegion = (GeographicRegionLandAreaYearIterator)findAncestorWithClass(this, GeographicRegionLandAreaYearIterator.class);
			pageContext.getOut().print(theGeographicRegion.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

