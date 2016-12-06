package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialITIterator theReport = (ReportNameOfficialITIterator)findAncestorWithClass(this, ReportNameOfficialITIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

