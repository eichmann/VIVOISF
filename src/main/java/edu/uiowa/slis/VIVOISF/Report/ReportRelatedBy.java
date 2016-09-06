package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportRelatedByIterator theReportRelatedByIterator = (ReportRelatedByIterator)findAncestorWithClass(this, ReportRelatedByIterator.class);
			pageContext.getOut().print(theReportRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

