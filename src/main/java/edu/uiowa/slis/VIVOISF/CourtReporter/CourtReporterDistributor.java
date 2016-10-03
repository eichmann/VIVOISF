package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterDistributorIterator theCourtReporterDistributorIterator = (CourtReporterDistributorIterator)findAncestorWithClass(this, CourtReporterDistributorIterator.class);
			pageContext.getOut().print(theCourtReporterDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for distributor tag ");
		}
		return SKIP_BODY;
	}
}

