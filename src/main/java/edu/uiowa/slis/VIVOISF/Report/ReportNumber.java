package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNumberIterator theReport = (ReportNumberIterator)findAncestorWithClass(this, ReportNumberIterator.class);
			pageContext.getOut().print(theReport.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for number tag ");
		}
		return SKIP_BODY;
	}
}

