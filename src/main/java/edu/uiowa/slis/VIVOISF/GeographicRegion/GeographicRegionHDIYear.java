package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHDIYearIterator theGeographicRegion = (GeographicRegionHDIYearIterator)findAncestorWithClass(this, GeographicRegionHDIYearIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

