package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCountryAreaYearIterator theEvent = (EventCountryAreaYearIterator)findAncestorWithClass(this, EventCountryAreaYearIterator.class);
			pageContext.getOut().print(theEvent.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

