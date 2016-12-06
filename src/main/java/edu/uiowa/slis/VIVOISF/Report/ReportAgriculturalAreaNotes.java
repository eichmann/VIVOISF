package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportAgriculturalAreaNotesIterator theReport = (ReportAgriculturalAreaNotesIterator)findAncestorWithClass(this, ReportAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theReport.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

