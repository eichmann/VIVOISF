package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasNameIterator theReportHasNameIterator = (ReportHasNameIterator)findAncestorWithClass(this, ReportHasNameIterator.class);
			pageContext.getOut().print(theReportHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasName tag ");
		}
		return SKIP_BODY;
	}
}

