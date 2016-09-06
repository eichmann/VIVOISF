package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportReportId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportReportId currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportReportId.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			if (!theReport.commitNeeded) {
				pageContext.getOut().print(theReport.getReportId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Report for reportId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reportId tag ");
		}
		return SKIP_BODY;
	}

	public String getReportId() throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			return theReport.getReportId();
		} catch (Exception e) {
			log.error(" Can't find enclosing Report for reportId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reportId tag ");
		}
	}

	public void setReportId(String reportId) throws JspTagException {
		try {
			Report theReport = (Report)findAncestorWithClass(this, Report.class);
			theReport.setReportId(reportId);
		} catch (Exception e) {
			log.error("Can't find enclosing Report for reportId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reportId tag ");
		}
	}
}

