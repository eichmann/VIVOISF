package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportDateTimeValueIterator theReportDateTimeValueIterator = (ReportDateTimeValueIterator)findAncestorWithClass(this, ReportDateTimeValueIterator.class);
			pageContext.getOut().print(theReportDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

