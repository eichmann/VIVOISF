package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCountryAreaUnitIterator theEvent = (EventCountryAreaUnitIterator)findAncestorWithClass(this, EventCountryAreaUnitIterator.class);
			pageContext.getOut().print(theEvent.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

