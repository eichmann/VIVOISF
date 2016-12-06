package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportRO_0002353Iterator theReportRO_0002353Iterator = (ReportRO_0002353Iterator)findAncestorWithClass(this, ReportRO_0002353Iterator.class);
			pageContext.getOut().print(theReportRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

