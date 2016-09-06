package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterTranslatorIterator theCourtReporterTranslatorIterator = (CourtReporterTranslatorIterator)findAncestorWithClass(this, CourtReporterTranslatorIterator.class);
			pageContext.getOut().print(theCourtReporterTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for translator tag ");
		}
		return SKIP_BODY;
	}
}

