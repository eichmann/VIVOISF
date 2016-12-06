package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHasMaxLongitudeIterator theLocation = (LocationHasMaxLongitudeIterator)findAncestorWithClass(this, LocationHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theLocation.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

