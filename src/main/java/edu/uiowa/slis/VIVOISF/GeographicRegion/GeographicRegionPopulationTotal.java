package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionPopulationTotalIterator theGeographicRegion = (GeographicRegionPopulationTotalIterator)findAncestorWithClass(this, GeographicRegionPopulationTotalIterator.class);
			pageContext.getOut().print(theGeographicRegion.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

