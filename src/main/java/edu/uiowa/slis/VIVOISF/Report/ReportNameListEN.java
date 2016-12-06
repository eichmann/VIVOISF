package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListENIterator theReport = (ReportNameListENIterator)findAncestorWithClass(this, ReportNameListENIterator.class);
			pageContext.getOut().print(theReport.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

