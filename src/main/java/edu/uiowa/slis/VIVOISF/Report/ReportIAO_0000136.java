package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportIAO_0000136Iterator theReportIAO_0000136Iterator = (ReportIAO_0000136Iterator)findAncestorWithClass(this, ReportIAO_0000136Iterator.class);
			pageContext.getOut().print(theReportIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

