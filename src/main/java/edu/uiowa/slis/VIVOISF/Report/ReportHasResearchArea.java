package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasResearchAreaIterator theReportHasResearchAreaIterator = (ReportHasResearchAreaIterator)findAncestorWithClass(this, ReportHasResearchAreaIterator.class);
			pageContext.getOut().print(theReportHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

