package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportTranslatorIterator theReportTranslatorIterator = (ReportTranslatorIterator)findAncestorWithClass(this, ReportTranslatorIterator.class);
			pageContext.getOut().print(theReportTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for translator tag ");
		}
		return SKIP_BODY;
	}
}

