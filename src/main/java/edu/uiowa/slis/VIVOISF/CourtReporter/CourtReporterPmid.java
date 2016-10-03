package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterPmidIterator theCourtReporter = (CourtReporterPmidIterator)findAncestorWithClass(this, CourtReporterPmidIterator.class);
			pageContext.getOut().print(theCourtReporter.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for pmid tag ");
		}
		return SKIP_BODY;
	}
}

