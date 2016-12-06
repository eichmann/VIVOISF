package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportGeographicFocusIterator theReportGeographicFocusIterator = (ReportGeographicFocusIterator)findAncestorWithClass(this, ReportGeographicFocusIterator.class);
			pageContext.getOut().print(theReportGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

