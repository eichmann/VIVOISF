package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionRO_0001015Iterator theGeographicRegionRO_0001015Iterator = (GeographicRegionRO_0001015Iterator)findAncestorWithClass(this, GeographicRegionRO_0001015Iterator.class);
			pageContext.getOut().print(theGeographicRegionRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

