package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRO_0002234Iterator theGeographicRegionRO_0002234Iterator = (GeographicRegionRO_0002234Iterator)findAncestorWithClass(this, GeographicRegionRO_0002234Iterator.class);
			pageContext.getOut().print(theGeographicRegionRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

