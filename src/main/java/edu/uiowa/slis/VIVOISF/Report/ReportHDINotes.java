package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHDINotesIterator theReport = (ReportHDINotesIterator)findAncestorWithClass(this, ReportHDINotesIterator.class);
			pageContext.getOut().print(theReport.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

