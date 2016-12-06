package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionDateTimeIntervalIterator theGeographicRegionDateTimeIntervalIterator = (GeographicRegionDateTimeIntervalIterator)findAncestorWithClass(this, GeographicRegionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theGeographicRegionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

