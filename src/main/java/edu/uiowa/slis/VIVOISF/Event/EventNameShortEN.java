package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortENIterator theEvent = (EventNameShortENIterator)findAncestorWithClass(this, EventNameShortENIterator.class);
			pageContext.getOut().print(theEvent.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

