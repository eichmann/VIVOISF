package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportStatusIterator theReportStatusIterator = (ReportStatusIterator)findAncestorWithClass(this, ReportStatusIterator.class);
			pageContext.getOut().print(theReportStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for status tag ");
		}
		return SKIP_BODY;
	}
}

