package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHasMinLongitudeIterator theLocation = (LocationHasMinLongitudeIterator)findAncestorWithClass(this, LocationHasMinLongitudeIterator.class);
			pageContext.getOut().print(theLocation.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

