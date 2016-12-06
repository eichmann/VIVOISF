package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasAddressIterator theReportHasAddressIterator = (ReportHasAddressIterator)findAncestorWithClass(this, ReportHasAddressIterator.class);
			pageContext.getOut().print(theReportHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

