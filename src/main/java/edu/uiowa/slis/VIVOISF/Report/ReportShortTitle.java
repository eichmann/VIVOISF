package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportShortTitleIterator theReport = (ReportShortTitleIterator)findAncestorWithClass(this, ReportShortTitleIterator.class);
			pageContext.getOut().print(theReport.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

