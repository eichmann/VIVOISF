package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasMinLatitudeIterator theGeographicLocation = (GeographicLocationHasMinLatitudeIterator)findAncestorWithClass(this, GeographicLocationHasMinLatitudeIterator.class);
			pageContext.getOut().print(theGeographicLocation.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

