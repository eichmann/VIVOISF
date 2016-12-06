package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationPopulationUnitIterator theGeographicLocation = (GeographicLocationPopulationUnitIterator)findAncestorWithClass(this, GeographicLocationPopulationUnitIterator.class);
			pageContext.getOut().print(theGeographicLocation.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

