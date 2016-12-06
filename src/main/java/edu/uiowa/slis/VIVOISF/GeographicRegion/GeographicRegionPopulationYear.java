package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionPopulationYearIterator theGeographicRegion = (GeographicRegionPopulationYearIterator)findAncestorWithClass(this, GeographicRegionPopulationYearIterator.class);
			pageContext.getOut().print(theGeographicRegion.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

