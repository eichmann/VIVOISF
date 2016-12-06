package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportLandAreaNotesIterator theReport = (ReportLandAreaNotesIterator)findAncestorWithClass(this, ReportLandAreaNotesIterator.class);
			pageContext.getOut().print(theReport.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

