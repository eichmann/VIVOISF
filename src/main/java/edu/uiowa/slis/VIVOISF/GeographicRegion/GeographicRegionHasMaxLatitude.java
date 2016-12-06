package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasMaxLatitudeIterator theGeographicRegion = (GeographicRegionHasMaxLatitudeIterator)findAncestorWithClass(this, GeographicRegionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

