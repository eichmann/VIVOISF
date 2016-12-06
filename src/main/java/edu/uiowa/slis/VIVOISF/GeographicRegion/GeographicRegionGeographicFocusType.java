package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGeographicFocusIterator theGeographicRegionGeographicFocusIterator = (GeographicRegionGeographicFocusIterator)findAncestorWithClass(this, GeographicRegionGeographicFocusIterator.class);
			pageContext.getOut().print(theGeographicRegionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

