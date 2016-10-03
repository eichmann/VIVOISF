package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterLccnIterator theCourtReporter = (CourtReporterLccnIterator)findAncestorWithClass(this, CourtReporterLccnIterator.class);
			pageContext.getOut().print(theCourtReporter.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for lccn tag ");
		}
		return SKIP_BODY;
	}
}

