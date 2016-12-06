package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(EventBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventBFO_0000050Iterator theEventBFO_0000050Iterator = (EventBFO_0000050Iterator)findAncestorWithClass(this, EventBFO_0000050Iterator.class);
			pageContext.getOut().print(theEventBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

