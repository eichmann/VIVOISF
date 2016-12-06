package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityENIterator theEvent = (EventNationalityENIterator)findAncestorWithClass(this, EventNationalityENIterator.class);
			pageContext.getOut().print(theEvent.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

