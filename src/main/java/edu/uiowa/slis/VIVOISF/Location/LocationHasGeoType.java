package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasGeoIterator theLocationHasGeoIterator = (LocationHasGeoIterator)findAncestorWithClass(this, LocationHasGeoIterator.class);
			pageContext.getOut().print(theLocationHasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

