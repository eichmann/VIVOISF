package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeoHasEmailIterator theGeoHasEmailIterator = (GeoHasEmailIterator)findAncestorWithClass(this, GeoHasEmailIterator.class);
			pageContext.getOut().print(theGeoHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

