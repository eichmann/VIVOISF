package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportContentIterator theReport = (ReportContentIterator)findAncestorWithClass(this, ReportContentIterator.class);
			pageContext.getOut().print(theReport.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for content tag ");
		}
		return SKIP_BODY;
	}
}
