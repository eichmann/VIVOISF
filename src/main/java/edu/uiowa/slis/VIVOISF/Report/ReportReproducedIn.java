package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportReproducedInIterator theReportReproducedInIterator = (ReportReproducedInIterator)findAncestorWithClass(this, ReportReproducedInIterator.class);
			pageContext.getOut().print(theReportReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

