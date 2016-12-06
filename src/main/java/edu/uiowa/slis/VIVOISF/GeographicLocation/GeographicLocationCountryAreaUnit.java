package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCountryAreaUnitIterator theGeographicLocation = (GeographicLocationCountryAreaUnitIterator)findAncestorWithClass(this, GeographicLocationCountryAreaUnitIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

