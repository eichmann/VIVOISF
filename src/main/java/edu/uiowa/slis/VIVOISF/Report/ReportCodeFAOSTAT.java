package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeFAOSTATIterator theReport = (ReportCodeFAOSTATIterator)findAncestorWithClass(this, ReportCodeFAOSTATIterator.class);
			pageContext.getOut().print(theReport.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

