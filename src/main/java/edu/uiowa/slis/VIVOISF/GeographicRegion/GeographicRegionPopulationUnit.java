package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionPopulationUnitIterator theGeographicRegion = (GeographicRegionPopulationUnitIterator)findAncestorWithClass(this, GeographicRegionPopulationUnitIterator.class);
			pageContext.getOut().print(theGeographicRegion.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

