package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterEissnIterator theCourtReporter = (CourtReporterEissnIterator)findAncestorWithClass(this, CourtReporterEissnIterator.class);
			pageContext.getOut().print(theCourtReporter.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for eissn tag ");
		}
		return SKIP_BODY;
	}
}

