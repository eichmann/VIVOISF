package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortFRIterator theReport = (ReportNameShortFRIterator)findAncestorWithClass(this, ReportNameShortFRIterator.class);
			pageContext.getOut().print(theReport.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

