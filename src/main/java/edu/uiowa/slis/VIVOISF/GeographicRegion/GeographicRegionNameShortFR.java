package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameShortFRIterator theGeographicRegion = (GeographicRegionNameShortFRIterator)findAncestorWithClass(this, GeographicRegionNameShortFRIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

