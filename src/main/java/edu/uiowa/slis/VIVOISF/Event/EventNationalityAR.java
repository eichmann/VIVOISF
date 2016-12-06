package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityARIterator theEvent = (EventNationalityARIterator)findAncestorWithClass(this, EventNationalityARIterator.class);
			pageContext.getOut().print(theEvent.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

