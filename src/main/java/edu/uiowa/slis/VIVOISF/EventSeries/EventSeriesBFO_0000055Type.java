package edu.uiowa.slis.VIVOISF.EventSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventSeriesBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventSeriesBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EventSeriesBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventSeriesBFO_0000055Iterator theEventSeriesBFO_0000055Iterator = (EventSeriesBFO_0000055Iterator)findAncestorWithClass(this, EventSeriesBFO_0000055Iterator.class);
			pageContext.getOut().print(theEventSeriesBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EventSeries for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

