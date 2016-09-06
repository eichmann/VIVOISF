package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportPresentedAtIterator theReportPresentedAtIterator = (ReportPresentedAtIterator)findAncestorWithClass(this, ReportPresentedAtIterator.class);
			pageContext.getOut().print(theReportPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

