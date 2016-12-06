package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportGDPYearIterator theReport = (ReportGDPYearIterator)findAncestorWithClass(this, ReportGDPYearIterator.class);
			pageContext.getOut().print(theReport.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

