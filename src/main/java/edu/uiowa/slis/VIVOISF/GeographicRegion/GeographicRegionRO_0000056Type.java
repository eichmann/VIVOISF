package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRO_0000056Iterator theGeographicRegionRO_0000056Iterator = (GeographicRegionRO_0000056Iterator)findAncestorWithClass(this, GeographicRegionRO_0000056Iterator.class);
			pageContext.getOut().print(theGeographicRegionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

