package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPagesIterator theReport = (ReportPagesIterator)findAncestorWithClass(this, ReportPagesIterator.class);
			pageContext.getOut().print(theReport.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for pages tag ");
		}
		return SKIP_BODY;
	}
}

