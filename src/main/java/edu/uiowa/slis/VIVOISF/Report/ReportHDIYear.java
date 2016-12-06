package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHDIYearIterator theReport = (ReportHDIYearIterator)findAncestorWithClass(this, ReportHDIYearIterator.class);
			pageContext.getOut().print(theReport.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

