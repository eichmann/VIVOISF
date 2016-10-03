package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CourtReporterIdentifierIterator theCourtReporter = (CourtReporterIdentifierIterator)findAncestorWithClass(this, CourtReporterIdentifierIterator.class);
			pageContext.getOut().print(theCourtReporter.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for identifier tag ");
		}
		return SKIP_BODY;
	}
}

