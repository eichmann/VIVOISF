package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportReproducesIterator theReportReproducesIterator = (ReportReproducesIterator)findAncestorWithClass(this, ReportReproducesIterator.class);
			pageContext.getOut().print(theReportReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

