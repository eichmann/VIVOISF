package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionAgriculturalAreaTotalIterator theGeographicRegion = (GeographicRegionAgriculturalAreaTotalIterator)findAncestorWithClass(this, GeographicRegionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theGeographicRegion.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

