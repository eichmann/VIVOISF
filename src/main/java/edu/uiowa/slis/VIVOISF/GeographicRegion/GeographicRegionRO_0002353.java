package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRO_0002353Iterator theGeographicRegionRO_0002353Iterator = (GeographicRegionRO_0002353Iterator)findAncestorWithClass(this, GeographicRegionRO_0002353Iterator.class);
			pageContext.getOut().print(theGeographicRegionRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

