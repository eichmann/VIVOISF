package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportPublicationVenueForIterator theReportPublicationVenueForIterator = (ReportPublicationVenueForIterator)findAncestorWithClass(this, ReportPublicationVenueForIterator.class);
			pageContext.getOut().print(theReportPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

