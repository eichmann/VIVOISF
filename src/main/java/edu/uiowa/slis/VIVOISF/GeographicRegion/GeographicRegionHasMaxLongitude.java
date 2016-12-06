package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasMaxLongitudeIterator theGeographicRegion = (GeographicRegionHasMaxLongitudeIterator)findAncestorWithClass(this, GeographicRegionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

