package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterFeaturesIterator theCourtReporterFeaturesIterator = (CourtReporterFeaturesIterator)findAncestorWithClass(this, CourtReporterFeaturesIterator.class);
			pageContext.getOut().print(theCourtReporterFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for features tag ");
		}
		return SKIP_BODY;
	}
}

