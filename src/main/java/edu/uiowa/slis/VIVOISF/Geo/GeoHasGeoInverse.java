package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoHasGeoInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoHasGeoInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoHasGeoInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeoHasGeoInverseIterator theGeoHasGeoInverseIterator = (GeoHasGeoInverseIterator)findAncestorWithClass(this, GeoHasGeoInverseIterator.class);
			pageContext.getOut().print(theGeoHasGeoInverseIterator.getHasGeoInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

