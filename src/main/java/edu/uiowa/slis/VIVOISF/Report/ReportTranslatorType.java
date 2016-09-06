package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportTranslatorIterator theReportTranslatorIterator = (ReportTranslatorIterator)findAncestorWithClass(this, ReportTranslatorIterator.class);
			pageContext.getOut().print(theReportTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for translator tag ");
		}
		return SKIP_BODY;
	}
}

