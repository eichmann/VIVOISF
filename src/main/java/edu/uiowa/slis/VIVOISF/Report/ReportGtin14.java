package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportGtin14Iterator theReport = (ReportGtin14Iterator)findAncestorWithClass(this, ReportGtin14Iterator.class);
			pageContext.getOut().print(theReport.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

