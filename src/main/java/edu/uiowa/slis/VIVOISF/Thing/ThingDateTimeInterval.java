package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingDateTimeIntervalIterator theThingDateTimeIntervalIterator = (ThingDateTimeIntervalIterator)findAncestorWithClass(this, ThingDateTimeIntervalIterator.class);
			pageContext.getOut().print(theThingDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

