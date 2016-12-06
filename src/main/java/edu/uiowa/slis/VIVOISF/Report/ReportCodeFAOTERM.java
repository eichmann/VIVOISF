package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeFAOTERMIterator theReport = (ReportCodeFAOTERMIterator)findAncestorWithClass(this, ReportCodeFAOTERMIterator.class);
			pageContext.getOut().print(theReport.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

