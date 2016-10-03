package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPageStartIterator theReport = (ReportPageStartIterator)findAncestorWithClass(this, ReportPageStartIterator.class);
			pageContext.getOut().print(theReport.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

