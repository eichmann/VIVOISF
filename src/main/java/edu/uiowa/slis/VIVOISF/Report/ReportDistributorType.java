package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportDistributorIterator theReportDistributorIterator = (ReportDistributorIterator)findAncestorWithClass(this, ReportDistributorIterator.class);
			pageContext.getOut().print(theReportDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for distributor tag ");
		}
		return SKIP_BODY;
	}
}

