package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionAgriculturalAreaUnitIterator theGeographicRegion = (GeographicRegionAgriculturalAreaUnitIterator)findAncestorWithClass(this, GeographicRegionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theGeographicRegion.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

