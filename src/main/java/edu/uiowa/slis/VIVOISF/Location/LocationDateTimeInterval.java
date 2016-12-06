package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationDateTimeIntervalIterator theLocationDateTimeIntervalIterator = (LocationDateTimeIntervalIterator)findAncestorWithClass(this, LocationDateTimeIntervalIterator.class);
			pageContext.getOut().print(theLocationDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

