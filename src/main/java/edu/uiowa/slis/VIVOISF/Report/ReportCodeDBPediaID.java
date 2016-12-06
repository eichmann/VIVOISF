package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodeDBPediaIDIterator theReport = (ReportCodeDBPediaIDIterator)findAncestorWithClass(this, ReportCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theReport.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

