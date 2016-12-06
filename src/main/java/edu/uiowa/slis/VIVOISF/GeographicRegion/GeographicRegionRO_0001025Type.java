package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRO_0001025Iterator theGeographicRegionRO_0001025Iterator = (GeographicRegionRO_0001025Iterator)findAncestorWithClass(this, GeographicRegionRO_0001025Iterator.class);
			pageContext.getOut().print(theGeographicRegionRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

