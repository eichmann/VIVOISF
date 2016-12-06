package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCountryAreaNotesIterator theReport = (ReportCountryAreaNotesIterator)findAncestorWithClass(this, ReportCountryAreaNotesIterator.class);
			pageContext.getOut().print(theReport.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

