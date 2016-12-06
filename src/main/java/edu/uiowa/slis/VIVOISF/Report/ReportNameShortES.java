package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortESIterator theReport = (ReportNameShortESIterator)findAncestorWithClass(this, ReportNameShortESIterator.class);
			pageContext.getOut().print(theReport.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

