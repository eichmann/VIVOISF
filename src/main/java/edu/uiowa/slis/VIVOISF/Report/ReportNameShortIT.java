package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortITIterator theReport = (ReportNameShortITIterator)findAncestorWithClass(this, ReportNameShortITIterator.class);
			pageContext.getOut().print(theReport.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

