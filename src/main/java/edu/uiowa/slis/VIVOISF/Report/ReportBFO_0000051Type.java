package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportBFO_0000051Iterator theReportBFO_0000051Iterator = (ReportBFO_0000051Iterator)findAncestorWithClass(this, ReportBFO_0000051Iterator.class);
			pageContext.getOut().print(theReportBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

