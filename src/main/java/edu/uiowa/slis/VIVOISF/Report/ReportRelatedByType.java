package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportRelatedByIterator theReportRelatedByIterator = (ReportRelatedByIterator)findAncestorWithClass(this, ReportRelatedByIterator.class);
			pageContext.getOut().print(theReportRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

