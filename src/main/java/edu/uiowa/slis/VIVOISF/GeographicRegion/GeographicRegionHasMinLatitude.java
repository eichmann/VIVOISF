package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasMinLatitudeIterator theGeographicRegion = (GeographicRegionHasMinLatitudeIterator)findAncestorWithClass(this, GeographicRegionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

