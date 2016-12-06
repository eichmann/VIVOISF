package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(EventBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventBFO_0000051Iterator theEventBFO_0000051Iterator = (EventBFO_0000051Iterator)findAncestorWithClass(this, EventBFO_0000051Iterator.class);
			pageContext.getOut().print(theEventBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

