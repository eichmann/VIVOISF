package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterDistributorIterator theCourtReporterDistributorIterator = (CourtReporterDistributorIterator)findAncestorWithClass(this, CourtReporterDistributorIterator.class);
			pageContext.getOut().print(theCourtReporterDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for distributor tag ");
		}
		return SKIP_BODY;
	}
}

