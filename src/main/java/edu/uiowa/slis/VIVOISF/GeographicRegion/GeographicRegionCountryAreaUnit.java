package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCountryAreaUnitIterator theGeographicRegion = (GeographicRegionCountryAreaUnitIterator)findAncestorWithClass(this, GeographicRegionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

