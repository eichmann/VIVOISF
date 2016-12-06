package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGeographicFocusIterator theGeographicRegionGeographicFocusIterator = (GeographicRegionGeographicFocusIterator)findAncestorWithClass(this, GeographicRegionGeographicFocusIterator.class);
			pageContext.getOut().print(theGeographicRegionGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

