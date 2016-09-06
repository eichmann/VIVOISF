package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterDateTimeValueIterator theCourtReporterDateTimeValueIterator = (CourtReporterDateTimeValueIterator)findAncestorWithClass(this, CourtReporterDateTimeValueIterator.class);
			pageContext.getOut().print(theCourtReporterDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

