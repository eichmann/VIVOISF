package edu.uiowa.slis.VIVOISF.EventSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventSeriesRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventSeriesRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EventSeriesRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventSeriesRO_0000057Iterator theEventSeriesRO_0000057Iterator = (EventSeriesRO_0000057Iterator)findAncestorWithClass(this, EventSeriesRO_0000057Iterator.class);
			pageContext.getOut().print(theEventSeriesRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EventSeries for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

