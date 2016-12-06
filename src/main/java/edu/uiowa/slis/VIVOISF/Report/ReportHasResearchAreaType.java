package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasResearchAreaIterator theReportHasResearchAreaIterator = (ReportHasResearchAreaIterator)findAncestorWithClass(this, ReportHasResearchAreaIterator.class);
			pageContext.getOut().print(theReportHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

