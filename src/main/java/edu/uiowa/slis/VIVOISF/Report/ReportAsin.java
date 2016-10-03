package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportAsinIterator theReport = (ReportAsinIterator)findAncestorWithClass(this, ReportAsinIterator.class);
			pageContext.getOut().print(theReport.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for asin tag ");
		}
		return SKIP_BODY;
	}
}

