package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeGAULIterator theReport = (ReportCodeGAULIterator)findAncestorWithClass(this, ReportCodeGAULIterator.class);
			pageContext.getOut().print(theReport.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

