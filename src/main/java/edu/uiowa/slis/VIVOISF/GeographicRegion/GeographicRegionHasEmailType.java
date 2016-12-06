package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasEmailIterator theGeographicRegionHasEmailIterator = (GeographicRegionHasEmailIterator)findAncestorWithClass(this, GeographicRegionHasEmailIterator.class);
			pageContext.getOut().print(theGeographicRegionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

