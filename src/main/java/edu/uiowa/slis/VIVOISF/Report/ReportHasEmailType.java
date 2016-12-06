package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasEmailIterator theReportHasEmailIterator = (ReportHasEmailIterator)findAncestorWithClass(this, ReportHasEmailIterator.class);
			pageContext.getOut().print(theReportHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

