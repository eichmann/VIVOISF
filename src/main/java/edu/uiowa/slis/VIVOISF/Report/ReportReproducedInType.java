package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportReproducedInIterator theReportReproducedInIterator = (ReportReproducedInIterator)findAncestorWithClass(this, ReportReproducedInIterator.class);
			pageContext.getOut().print(theReportReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

