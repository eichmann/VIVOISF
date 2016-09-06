package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportCitesIterator theReportCitesIterator = (ReportCitesIterator)findAncestorWithClass(this, ReportCitesIterator.class);
			pageContext.getOut().print(theReportCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for cites tag ");
		}
		return SKIP_BODY;
	}
}

