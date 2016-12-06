package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionLandAreaTotalIterator theGeographicRegion = (GeographicRegionLandAreaTotalIterator)findAncestorWithClass(this, GeographicRegionLandAreaTotalIterator.class);
			pageContext.getOut().print(theGeographicRegion.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

