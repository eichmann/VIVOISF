package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasTelephoneIterator theEventHasTelephoneIterator = (EventHasTelephoneIterator)findAncestorWithClass(this, EventHasTelephoneIterator.class);
			pageContext.getOut().print(theEventHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

