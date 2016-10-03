package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPageEndIterator theReport = (ReportPageEndIterator)findAncestorWithClass(this, ReportPageEndIterator.class);
			pageContext.getOut().print(theReport.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

