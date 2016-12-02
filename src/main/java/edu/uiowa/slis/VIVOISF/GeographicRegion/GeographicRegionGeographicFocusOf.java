package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGeographicFocusOfIterator theGeographicRegion = (GeographicRegionGeographicFocusOfIterator)findAncestorWithClass(this, GeographicRegionGeographicFocusOfIterator.class);
			pageContext.getOut().print(theGeographicRegion.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

