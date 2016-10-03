package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportReviewOfIterator theReportReviewOfIterator = (ReportReviewOfIterator)findAncestorWithClass(this, ReportReviewOfIterator.class);
			pageContext.getOut().print(theReportReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

