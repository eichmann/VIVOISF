package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeUNIterator theReport = (ReportCodeUNIterator)findAncestorWithClass(this, ReportCodeUNIterator.class);
			pageContext.getOut().print(theReport.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

