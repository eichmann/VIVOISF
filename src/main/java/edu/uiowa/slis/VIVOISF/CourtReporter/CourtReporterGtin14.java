package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterGtin14Iterator theCourtReporter = (CourtReporterGtin14Iterator)findAncestorWithClass(this, CourtReporterGtin14Iterator.class);
			pageContext.getOut().print(theCourtReporter.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

