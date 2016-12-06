package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasPublicationVenueIterator theReportHasPublicationVenueIterator = (ReportHasPublicationVenueIterator)findAncestorWithClass(this, ReportHasPublicationVenueIterator.class);
			pageContext.getOut().print(theReportHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

