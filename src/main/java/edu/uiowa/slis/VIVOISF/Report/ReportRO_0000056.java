package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportRO_0000056Iterator theReportRO_0000056Iterator = (ReportRO_0000056Iterator)findAncestorWithClass(this, ReportRO_0000056Iterator.class);
			pageContext.getOut().print(theReportRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

