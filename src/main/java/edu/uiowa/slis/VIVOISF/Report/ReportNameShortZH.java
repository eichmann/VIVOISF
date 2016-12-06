package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortZHIterator theReport = (ReportNameShortZHIterator)findAncestorWithClass(this, ReportNameShortZHIterator.class);
			pageContext.getOut().print(theReport.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

