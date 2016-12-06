package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialFRIterator theReport = (ReportNameOfficialFRIterator)findAncestorWithClass(this, ReportNameOfficialFRIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

