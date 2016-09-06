package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRO_0000053Iterator theGeographicRegionRO_0000053Iterator = (GeographicRegionRO_0000053Iterator)findAncestorWithClass(this, GeographicRegionRO_0000053Iterator.class);
			pageContext.getOut().print(theGeographicRegionRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

