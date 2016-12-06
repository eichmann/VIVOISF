package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasTitleIterator theGeographicRegionHasTitleIterator = (GeographicRegionHasTitleIterator)findAncestorWithClass(this, GeographicRegionHasTitleIterator.class);
			pageContext.getOut().print(theGeographicRegionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

