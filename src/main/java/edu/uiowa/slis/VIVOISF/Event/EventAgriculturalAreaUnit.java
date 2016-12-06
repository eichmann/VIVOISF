package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventAgriculturalAreaUnitIterator theEvent = (EventAgriculturalAreaUnitIterator)findAncestorWithClass(this, EventAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theEvent.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

