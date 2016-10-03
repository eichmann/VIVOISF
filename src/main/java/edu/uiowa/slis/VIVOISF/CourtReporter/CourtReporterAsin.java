package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterAsinIterator theCourtReporter = (CourtReporterAsinIterator)findAncestorWithClass(this, CourtReporterAsinIterator.class);
			pageContext.getOut().print(theCourtReporter.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for asin tag ");
		}
		return SKIP_BODY;
	}
}

