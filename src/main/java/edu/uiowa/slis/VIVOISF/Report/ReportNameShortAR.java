package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortARIterator theReport = (ReportNameShortARIterator)findAncestorWithClass(this, ReportNameShortARIterator.class);
			pageContext.getOut().print(theReport.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

