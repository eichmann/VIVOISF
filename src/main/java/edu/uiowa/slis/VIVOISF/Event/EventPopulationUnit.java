package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventPopulationUnitIterator theEvent = (EventPopulationUnitIterator)findAncestorWithClass(this, EventPopulationUnitIterator.class);
			pageContext.getOut().print(theEvent.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

