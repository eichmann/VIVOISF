package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCountryAreaYearIterator theLocation = (LocationCountryAreaYearIterator)findAncestorWithClass(this, LocationCountryAreaYearIterator.class);
			pageContext.getOut().print(theLocation.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

