package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventGeographicFocusIterator theEventGeographicFocusIterator = (EventGeographicFocusIterator)findAncestorWithClass(this, EventGeographicFocusIterator.class);
			pageContext.getOut().print(theEventGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

