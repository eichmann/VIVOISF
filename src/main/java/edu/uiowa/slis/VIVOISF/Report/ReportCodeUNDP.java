package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeUNDPIterator theReport = (ReportCodeUNDPIterator)findAncestorWithClass(this, ReportCodeUNDPIterator.class);
			pageContext.getOut().print(theReport.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

