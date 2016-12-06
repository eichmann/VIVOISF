package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportRO_0001015Iterator theReportRO_0001015Iterator = (ReportRO_0001015Iterator)findAncestorWithClass(this, ReportRO_0001015Iterator.class);
			pageContext.getOut().print(theReportRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

