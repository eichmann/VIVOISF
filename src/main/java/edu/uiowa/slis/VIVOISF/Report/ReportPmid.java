package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPmidIterator theReport = (ReportPmidIterator)findAncestorWithClass(this, ReportPmidIterator.class);
			pageContext.getOut().print(theReport.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for pmid tag ");
		}
		return SKIP_BODY;
	}
}

