package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityENIterator theReport = (ReportNationalityENIterator)findAncestorWithClass(this, ReportNationalityENIterator.class);
			pageContext.getOut().print(theReport.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

