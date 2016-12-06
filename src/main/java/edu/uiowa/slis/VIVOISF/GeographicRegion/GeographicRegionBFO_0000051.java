package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionBFO_0000051Iterator theGeographicRegionBFO_0000051Iterator = (GeographicRegionBFO_0000051Iterator)findAncestorWithClass(this, GeographicRegionBFO_0000051Iterator.class);
			pageContext.getOut().print(theGeographicRegionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

