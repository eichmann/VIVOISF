package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionBFO_0000050Iterator theGeographicRegionBFO_0000050Iterator = (GeographicRegionBFO_0000050Iterator)findAncestorWithClass(this, GeographicRegionBFO_0000050Iterator.class);
			pageContext.getOut().print(theGeographicRegionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

