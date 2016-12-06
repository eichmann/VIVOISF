package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasMaxLatitudeIterator theGeographicLocation = (GeographicLocationHasMaxLatitudeIterator)findAncestorWithClass(this, GeographicLocationHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

