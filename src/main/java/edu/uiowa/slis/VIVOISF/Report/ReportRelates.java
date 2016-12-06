package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportRelatesIterator theReportRelatesIterator = (ReportRelatesIterator)findAncestorWithClass(this, ReportRelatesIterator.class);
			pageContext.getOut().print(theReportRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for relates tag ");
		}
		return SKIP_BODY;
	}
}

