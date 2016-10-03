package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterIssnIterator theCourtReporter = (CourtReporterIssnIterator)findAncestorWithClass(this, CourtReporterIssnIterator.class);
			pageContext.getOut().print(theCourtReporter.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for issn tag ");
		}
		return SKIP_BODY;
	}
}

