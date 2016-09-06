package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeoHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeoHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(GeoHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeoHasAddressIterator theGeoHasAddressIterator = (GeoHasAddressIterator)findAncestorWithClass(this, GeoHasAddressIterator.class);
			pageContext.getOut().print(theGeoHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Geo for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geo for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

