package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationDateTimeValueIterator theGeographicLocationDateTimeValueIterator = (GeographicLocationDateTimeValueIterator)findAncestorWithClass(this, GeographicLocationDateTimeValueIterator.class);
			pageContext.getOut().print(theGeographicLocationDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

