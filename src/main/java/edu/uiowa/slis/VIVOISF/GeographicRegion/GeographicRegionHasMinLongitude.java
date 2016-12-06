package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasMinLongitudeIterator theGeographicRegion = (GeographicRegionHasMinLongitudeIterator)findAncestorWithClass(this, GeographicRegionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

