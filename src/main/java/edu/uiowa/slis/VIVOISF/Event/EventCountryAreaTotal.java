package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCountryAreaTotalIterator theEvent = (EventCountryAreaTotalIterator)findAncestorWithClass(this, EventCountryAreaTotalIterator.class);
			pageContext.getOut().print(theEvent.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

