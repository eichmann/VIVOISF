package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterDoiIterator theCourtReporter = (CourtReporterDoiIterator)findAncestorWithClass(this, CourtReporterDoiIterator.class);
			pageContext.getOut().print(theCourtReporter.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for doi tag ");
		}
		return SKIP_BODY;
	}
}

