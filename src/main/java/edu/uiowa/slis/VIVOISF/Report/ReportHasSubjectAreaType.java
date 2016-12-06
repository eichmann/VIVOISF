package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasSubjectAreaIterator theReportHasSubjectAreaIterator = (ReportHasSubjectAreaIterator)findAncestorWithClass(this, ReportHasSubjectAreaIterator.class);
			pageContext.getOut().print(theReportHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

