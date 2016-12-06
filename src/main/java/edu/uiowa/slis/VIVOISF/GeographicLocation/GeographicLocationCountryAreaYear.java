package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCountryAreaYearIterator theGeographicLocation = (GeographicLocationCountryAreaYearIterator)findAncestorWithClass(this, GeographicLocationCountryAreaYearIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

