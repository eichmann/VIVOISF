package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterSici currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterSiciIterator theCourtReporter = (CourtReporterSiciIterator)findAncestorWithClass(this, CourtReporterSiciIterator.class);
			pageContext.getOut().print(theCourtReporter.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for sici tag ");
		}
		return SKIP_BODY;
	}
}

