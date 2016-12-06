package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHasMaxLatitudeIterator theLocation = (LocationHasMaxLatitudeIterator)findAncestorWithClass(this, LocationHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theLocation.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

