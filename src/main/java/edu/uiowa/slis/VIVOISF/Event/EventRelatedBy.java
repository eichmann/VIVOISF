package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(EventRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventRelatedByIterator theEventRelatedByIterator = (EventRelatedByIterator)findAncestorWithClass(this, EventRelatedByIterator.class);
			pageContext.getOut().print(theEventRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

