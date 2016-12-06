package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingDateTimeIntervalIterator theThingDateTimeIntervalIterator = (ThingDateTimeIntervalIterator)findAncestorWithClass(this, ThingDateTimeIntervalIterator.class);
			pageContext.getOut().print(theThingDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

