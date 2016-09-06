package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterRelatedByIterator theCourtReporterRelatedByIterator = (CourtReporterRelatedByIterator)findAncestorWithClass(this, CourtReporterRelatedByIterator.class);
			pageContext.getOut().print(theCourtReporterRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

