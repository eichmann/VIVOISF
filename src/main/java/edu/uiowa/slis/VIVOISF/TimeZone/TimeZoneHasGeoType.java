package edu.uiowa.slis.VIVOISF.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TimeZoneHasGeoType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TimeZoneHasGeoType currentInstance = null;
	private static final Log log = LogFactory.getLog(TimeZoneHasGeoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TimeZoneHasGeoIterator theTimeZoneHasGeoIterator = (TimeZoneHasGeoIterator)findAncestorWithClass(this, TimeZoneHasGeoIterator.class);
			pageContext.getOut().print(theTimeZoneHasGeoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TimeZone for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing TimeZone for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

