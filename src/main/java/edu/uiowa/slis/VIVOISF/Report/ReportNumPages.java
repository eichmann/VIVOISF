package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNumPagesIterator theReport = (ReportNumPagesIterator)findAncestorWithClass(this, ReportNumPagesIterator.class);
			pageContext.getOut().print(theReport.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for numPages tag ");
		}
		return SKIP_BODY;
	}
}

