package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoGeo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeoGeoIterator theGeo = (GeoGeoIterator)findAncestorWithClass(this, GeoGeoIterator.class);
			pageContext.getOut().print(theGeo.getGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for geo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for geo tag ");
		}
		return SKIP_BODY;
	}
}

