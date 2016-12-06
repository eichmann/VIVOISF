package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventPopulationTotalIterator theEvent = (EventPopulationTotalIterator)findAncestorWithClass(this, EventPopulationTotalIterator.class);
			pageContext.getOut().print(theEvent.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

