package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCountryAreaTotalIterator theLocation = (LocationCountryAreaTotalIterator)findAncestorWithClass(this, LocationCountryAreaTotalIterator.class);
			pageContext.getOut().print(theLocation.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

