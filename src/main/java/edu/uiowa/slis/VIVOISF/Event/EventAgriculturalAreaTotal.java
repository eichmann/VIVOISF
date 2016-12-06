package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventAgriculturalAreaTotalIterator theEvent = (EventAgriculturalAreaTotalIterator)findAncestorWithClass(this, EventAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theEvent.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

