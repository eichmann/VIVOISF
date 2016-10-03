package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportSiciIterator theReport = (ReportSiciIterator)findAncestorWithClass(this, ReportSiciIterator.class);
			pageContext.getOut().print(theReport.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for sici tag ");
		}
		return SKIP_BODY;
	}
}

