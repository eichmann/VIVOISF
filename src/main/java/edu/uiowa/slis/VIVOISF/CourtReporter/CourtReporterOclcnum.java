package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterOclcnumIterator theCourtReporter = (CourtReporterOclcnumIterator)findAncestorWithClass(this, CourtReporterOclcnumIterator.class);
			pageContext.getOut().print(theCourtReporter.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

