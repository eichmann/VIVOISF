package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationLandAreaYearIterator theGeographicLocation = (GeographicLocationLandAreaYearIterator)findAncestorWithClass(this, GeographicLocationLandAreaYearIterator.class);
			pageContext.getOut().print(theGeographicLocation.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

