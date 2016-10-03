package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportOclcnumIterator theReport = (ReportOclcnumIterator)findAncestorWithClass(this, ReportOclcnumIterator.class);
			pageContext.getOut().print(theReport.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

