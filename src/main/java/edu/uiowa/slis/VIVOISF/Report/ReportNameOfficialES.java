package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialESIterator theReport = (ReportNameOfficialESIterator)findAncestorWithClass(this, ReportNameOfficialESIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

