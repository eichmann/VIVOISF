package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportPresentedAtIterator theReportPresentedAtIterator = (ReportPresentedAtIterator)findAncestorWithClass(this, ReportPresentedAtIterator.class);
			pageContext.getOut().print(theReportPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

