package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityFRIterator theEvent = (EventNationalityFRIterator)findAncestorWithClass(this, EventNationalityFRIterator.class);
			pageContext.getOut().print(theEvent.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

