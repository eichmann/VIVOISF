package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialENIterator theEvent = (EventNameOfficialENIterator)findAncestorWithClass(this, EventNameOfficialENIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

