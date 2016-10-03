package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportTranscriptOfIterator theReportTranscriptOfIterator = (ReportTranscriptOfIterator)findAncestorWithClass(this, ReportTranscriptOfIterator.class);
			pageContext.getOut().print(theReportTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

