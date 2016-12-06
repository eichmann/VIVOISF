package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportDateTimeIntervalIterator theReportDateTimeIntervalIterator = (ReportDateTimeIntervalIterator)findAncestorWithClass(this, ReportDateTimeIntervalIterator.class);
			pageContext.getOut().print(theReportDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

