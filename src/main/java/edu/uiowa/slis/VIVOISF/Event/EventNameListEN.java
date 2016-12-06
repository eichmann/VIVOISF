package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListENIterator theEvent = (EventNameListENIterator)findAncestorWithClass(this, EventNameListENIterator.class);
			pageContext.getOut().print(theEvent.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

