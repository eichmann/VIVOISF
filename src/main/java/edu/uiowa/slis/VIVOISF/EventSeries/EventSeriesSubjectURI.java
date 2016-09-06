package edu.uiowa.slis.VIVOISF.EventSeries;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventSeriesSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventSeriesSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EventSeriesSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EventSeries theEventSeries = (EventSeries)findAncestorWithClass(this, EventSeries.class);
			if (!theEventSeries.commitNeeded) {
				pageContext.getOut().print(theEventSeries.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EventSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EventSeries theEventSeries = (EventSeries)findAncestorWithClass(this, EventSeries.class);
			return theEventSeries.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EventSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EventSeries theEventSeries = (EventSeries)findAncestorWithClass(this, EventSeries.class);
			theEventSeries.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EventSeries for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EventSeries for subjectURI tag ");
		}
	}
}

