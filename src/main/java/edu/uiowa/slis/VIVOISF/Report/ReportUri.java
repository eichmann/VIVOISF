package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportUriIterator theReport = (ReportUriIterator)findAncestorWithClass(this, ReportUriIterator.class);
			pageContext.getOut().print(theReport.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for uri tag ");
		}
		return SKIP_BODY;
	}
}

