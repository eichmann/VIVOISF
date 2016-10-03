package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterUri currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterUriIterator theCourtReporter = (CourtReporterUriIterator)findAncestorWithClass(this, CourtReporterUriIterator.class);
			pageContext.getOut().print(theCourtReporter.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for uri tag ");
		}
		return SKIP_BODY;
	}
}

