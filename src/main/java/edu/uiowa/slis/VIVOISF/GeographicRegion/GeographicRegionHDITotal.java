package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHDITotalIterator theGeographicRegion = (GeographicRegionHDITotalIterator)findAncestorWithClass(this, GeographicRegionHDITotalIterator.class);
			pageContext.getOut().print(theGeographicRegion.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

