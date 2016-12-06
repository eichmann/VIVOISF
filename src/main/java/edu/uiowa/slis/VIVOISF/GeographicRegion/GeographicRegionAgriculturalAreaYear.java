package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionAgriculturalAreaYearIterator theGeographicRegion = (GeographicRegionAgriculturalAreaYearIterator)findAncestorWithClass(this, GeographicRegionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theGeographicRegion.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

