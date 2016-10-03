package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportLocatorIterator theReport = (ReportLocatorIterator)findAncestorWithClass(this, ReportLocatorIterator.class);
			pageContext.getOut().print(theReport.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for locator tag ");
		}
		return SKIP_BODY;
	}
}

