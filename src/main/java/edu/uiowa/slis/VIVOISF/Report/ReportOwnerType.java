package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportOwnerIterator theReportOwnerIterator = (ReportOwnerIterator)findAncestorWithClass(this, ReportOwnerIterator.class);
			pageContext.getOut().print(theReportOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for owner tag ");
		}
		return SKIP_BODY;
	}
}

