package edu.uiowa.slis.VIVOISF.EventSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventSeriesLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventSeriesLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EventSeriesLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EventSeries theEventSeries = (EventSeries)findAncestorWithClass(this, EventSeries.class);
			if (!theEventSeries.commitNeeded) {
				pageContext.getOut().print(theEventSeries.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EventSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EventSeries theEventSeries = (EventSeries)findAncestorWithClass(this, EventSeries.class);
			return theEventSeries.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EventSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EventSeries theEventSeries = (EventSeries)findAncestorWithClass(this, EventSeries.class);
			theEventSeries.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EventSeries for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for label tag ");
		}
	}
}

