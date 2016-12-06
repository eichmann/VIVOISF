package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortZHIterator theGeographicRegion = (GeographicRegionNameShortZHIterator)findAncestorWithClass(this, GeographicRegionNameShortZHIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

