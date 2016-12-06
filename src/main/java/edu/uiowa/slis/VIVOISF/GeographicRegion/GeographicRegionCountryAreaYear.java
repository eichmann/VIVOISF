package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCountryAreaYearIterator theGeographicRegion = (GeographicRegionCountryAreaYearIterator)findAncestorWithClass(this, GeographicRegionCountryAreaYearIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

