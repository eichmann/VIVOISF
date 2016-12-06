package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventAgriculturalAreaYearIterator theEvent = (EventAgriculturalAreaYearIterator)findAncestorWithClass(this, EventAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theEvent.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

