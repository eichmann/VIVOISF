package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGDPYearIterator theGeographicRegion = (GeographicRegionGDPYearIterator)findAncestorWithClass(this, GeographicRegionGDPYearIterator.class);
			pageContext.getOut().print(theGeographicRegion.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

