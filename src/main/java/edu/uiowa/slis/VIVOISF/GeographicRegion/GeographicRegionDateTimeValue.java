package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionDateTimeValueIterator theGeographicRegionDateTimeValueIterator = (GeographicRegionDateTimeValueIterator)findAncestorWithClass(this, GeographicRegionDateTimeValueIterator.class);
			pageContext.getOut().print(theGeographicRegionDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

