package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterInformationResourceSupportedByIterator theCourtReporterInformationResourceSupportedByIterator = (CourtReporterInformationResourceSupportedByIterator)findAncestorWithClass(this, CourtReporterInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCourtReporterInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

