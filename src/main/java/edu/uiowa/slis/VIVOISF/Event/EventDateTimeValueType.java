package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventDateTimeValueIterator theEventDateTimeValueIterator = (EventDateTimeValueIterator)findAncestorWithClass(this, EventDateTimeValueIterator.class);
			pageContext.getOut().print(theEventDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
