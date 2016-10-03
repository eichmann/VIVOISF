package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterCodenIterator theCourtReporter = (CourtReporterCodenIterator)findAncestorWithClass(this, CourtReporterCodenIterator.class);
			pageContext.getOut().print(theCourtReporter.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for coden tag ");
		}
		return SKIP_BODY;
	}
}

