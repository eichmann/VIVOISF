package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityITIterator theEvent = (EventNationalityITIterator)findAncestorWithClass(this, EventNationalityITIterator.class);
			pageContext.getOut().print(theEvent.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

