package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialZHIterator theReport = (ReportNameOfficialZHIterator)findAncestorWithClass(this, ReportNameOfficialZHIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

