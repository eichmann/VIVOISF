package edu.uiowa.slis.VIVOISF.CourtReporter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourtReporterIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourtReporterIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(CourtReporterIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourtReporterIssuerIterator theCourtReporterIssuerIterator = (CourtReporterIssuerIterator)findAncestorWithClass(this, CourtReporterIssuerIterator.class);
			pageContext.getOut().print(theCourtReporterIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing CourtReporter for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CourtReporter for issuer tag ");
		}
		return SKIP_BODY;
	}
}

