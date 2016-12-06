package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialENIterator theReport = (ReportNameOfficialENIterator)findAncestorWithClass(this, ReportNameOfficialENIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

