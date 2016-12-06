package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingDateTimeValueIterator theThingDateTimeValueIterator = (ThingDateTimeValueIterator)findAncestorWithClass(this, ThingDateTimeValueIterator.class);
			pageContext.getOut().print(theThingDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

