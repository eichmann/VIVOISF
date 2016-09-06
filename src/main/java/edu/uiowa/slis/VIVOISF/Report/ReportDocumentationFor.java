package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportDocumentationForIterator theReportDocumentationForIterator = (ReportDocumentationForIterator)findAncestorWithClass(this, ReportDocumentationForIterator.class);
			pageContext.getOut().print(theReportDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

