package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionDescriptionIterator theGeographicRegion = (GeographicRegionDescriptionIterator)findAncestorWithClass(this, GeographicRegionDescriptionIterator.class);
			pageContext.getOut().print(theGeographicRegion.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for description tag ");
		}
		return SKIP_BODY;
	}
}

