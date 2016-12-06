package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialARIterator theReport = (ReportNameOfficialARIterator)findAncestorWithClass(this, ReportNameOfficialARIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

