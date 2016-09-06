package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoHasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoHasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoHasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeoHasGeoIterator theGeoHasGeoIterator = (GeoHasGeoIterator)findAncestorWithClass(this, GeoHasGeoIterator.class);
			pageContext.getOut().print(theGeoHasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

