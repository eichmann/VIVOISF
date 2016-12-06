package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCountryAreaTotalIterator theGeographicLocation = (GeographicLocationCountryAreaTotalIterator)findAncestorWithClass(this, GeographicLocationCountryAreaTotalIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

