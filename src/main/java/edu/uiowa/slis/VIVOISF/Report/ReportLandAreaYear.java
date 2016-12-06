package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportLandAreaYearIterator theReport = (ReportLandAreaYearIterator)findAncestorWithClass(this, ReportLandAreaYearIterator.class);
			pageContext.getOut().print(theReport.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

