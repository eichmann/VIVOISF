package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationPopulationTotalIterator theGeographicLocation = (GeographicLocationPopulationTotalIterator)findAncestorWithClass(this, GeographicLocationPopulationTotalIterator.class);
			pageContext.getOut().print(theGeographicLocation.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

