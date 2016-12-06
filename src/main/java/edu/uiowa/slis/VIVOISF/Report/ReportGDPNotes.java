package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportGDPNotesIterator theReport = (ReportGDPNotesIterator)findAncestorWithClass(this, ReportGDPNotesIterator.class);
			pageContext.getOut().print(theReport.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

