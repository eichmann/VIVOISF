package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventPopulationYearIterator theEvent = (EventPopulationYearIterator)findAncestorWithClass(this, EventPopulationYearIterator.class);
			pageContext.getOut().print(theEvent.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

