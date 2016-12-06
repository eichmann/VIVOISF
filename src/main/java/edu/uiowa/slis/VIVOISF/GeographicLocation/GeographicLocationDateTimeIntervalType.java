package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationDateTimeIntervalIterator theGeographicLocationDateTimeIntervalIterator = (GeographicLocationDateTimeIntervalIterator)findAncestorWithClass(this, GeographicLocationDateTimeIntervalIterator.class);
			pageContext.getOut().print(theGeographicLocationDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

