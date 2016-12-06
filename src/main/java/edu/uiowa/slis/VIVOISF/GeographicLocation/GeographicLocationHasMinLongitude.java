package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasMinLongitudeIterator theGeographicLocation = (GeographicLocationHasMinLongitudeIterator)findAncestorWithClass(this, GeographicLocationHasMinLongitudeIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

