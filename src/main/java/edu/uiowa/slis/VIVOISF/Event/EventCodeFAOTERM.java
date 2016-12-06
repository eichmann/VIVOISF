package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeFAOTERMIterator theEvent = (EventCodeFAOTERMIterator)findAncestorWithClass(this, EventCodeFAOTERMIterator.class);
			pageContext.getOut().print(theEvent.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

