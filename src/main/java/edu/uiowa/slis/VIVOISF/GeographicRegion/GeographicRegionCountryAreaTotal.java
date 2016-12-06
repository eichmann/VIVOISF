package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCountryAreaTotalIterator theGeographicRegion = (GeographicRegionCountryAreaTotalIterator)findAncestorWithClass(this, GeographicRegionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

