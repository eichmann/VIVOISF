package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportIssuerIterator theReportIssuerIterator = (ReportIssuerIterator)findAncestorWithClass(this, ReportIssuerIterator.class);
			pageContext.getOut().print(theReportIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for issuer tag ");
		}
		return SKIP_BODY;
	}
}

