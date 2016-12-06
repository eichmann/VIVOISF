package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeISO2Iterator theReport = (ReportCodeISO2Iterator)findAncestorWithClass(this, ReportCodeISO2Iterator.class);
			pageContext.getOut().print(theReport.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

