package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPopulationNotesIterator theReport = (ReportPopulationNotesIterator)findAncestorWithClass(this, ReportPopulationNotesIterator.class);
			pageContext.getOut().print(theReport.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

