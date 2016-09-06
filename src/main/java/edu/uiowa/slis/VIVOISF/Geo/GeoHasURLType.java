package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeoHasURLIterator theGeoHasURLIterator = (GeoHasURLIterator)findAncestorWithClass(this, GeoHasURLIterator.class);
			pageContext.getOut().print(theGeoHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

