package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGDPUnitIterator theGeographicRegion = (GeographicRegionGDPUnitIterator)findAncestorWithClass(this, GeographicRegionGDPUnitIterator.class);
			pageContext.getOut().print(theGeographicRegion.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

