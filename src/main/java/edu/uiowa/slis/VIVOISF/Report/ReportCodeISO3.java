package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeISO3Iterator theReport = (ReportCodeISO3Iterator)findAncestorWithClass(this, ReportCodeISO3Iterator.class);
			pageContext.getOut().print(theReport.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

