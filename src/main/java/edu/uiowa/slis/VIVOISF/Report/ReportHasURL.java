package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasURLIterator theReportHasURLIterator = (ReportHasURLIterator)findAncestorWithClass(this, ReportHasURLIterator.class);
			pageContext.getOut().print(theReportHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

