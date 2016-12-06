package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCodeDBPediaIDIterator theEvent = (EventCodeDBPediaIDIterator)findAncestorWithClass(this, EventCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theEvent.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

