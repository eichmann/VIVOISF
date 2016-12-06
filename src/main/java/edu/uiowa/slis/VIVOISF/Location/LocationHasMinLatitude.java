package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationHasMinLatitudeIterator theLocation = (LocationHasMinLatitudeIterator)findAncestorWithClass(this, LocationHasMinLatitudeIterator.class);
			pageContext.getOut().print(theLocation.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

