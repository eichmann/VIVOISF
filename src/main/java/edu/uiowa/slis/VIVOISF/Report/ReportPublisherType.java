package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportPublisherIterator theReportPublisherIterator = (ReportPublisherIterator)findAncestorWithClass(this, ReportPublisherIterator.class);
			pageContext.getOut().print(theReportPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for publisher tag ");
		}
		return SKIP_BODY;
	}
}

