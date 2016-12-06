package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportUrlIterator theReport = (ReportUrlIterator)findAncestorWithClass(this, ReportUrlIterator.class);
			pageContext.getOut().print(theReport.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for url tag ");
		}
		return SKIP_BODY;
	}
}

