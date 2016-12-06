package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationPopulationTotalIterator theLocation = (LocationPopulationTotalIterator)findAncestorWithClass(this, LocationPopulationTotalIterator.class);
			pageContext.getOut().print(theLocation.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

