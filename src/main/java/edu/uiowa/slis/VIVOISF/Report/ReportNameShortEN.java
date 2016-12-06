package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortENIterator theReport = (ReportNameShortENIterator)findAncestorWithClass(this, ReportNameShortENIterator.class);
			pageContext.getOut().print(theReport.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

