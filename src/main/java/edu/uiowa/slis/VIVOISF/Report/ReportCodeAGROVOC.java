package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeAGROVOCIterator theReport = (ReportCodeAGROVOCIterator)findAncestorWithClass(this, ReportCodeAGROVOCIterator.class);
			pageContext.getOut().print(theReport.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

