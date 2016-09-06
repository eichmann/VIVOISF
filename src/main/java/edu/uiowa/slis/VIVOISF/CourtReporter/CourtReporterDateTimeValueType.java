package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterDateTimeValueIterator theCourtReporterDateTimeValueIterator = (CourtReporterDateTimeValueIterator)findAncestorWithClass(this, CourtReporterDateTimeValueIterator.class);
			pageContext.getOut().print(theCourtReporterDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

