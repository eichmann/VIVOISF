package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasMaxLongitudeIterator theGeographicLocation = (GeographicLocationHasMaxLongitudeIterator)findAncestorWithClass(this, GeographicLocationHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

