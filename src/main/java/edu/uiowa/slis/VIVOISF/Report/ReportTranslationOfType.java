package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportTranslationOfIterator theReportTranslationOfIterator = (ReportTranslationOfIterator)findAncestorWithClass(this, ReportTranslationOfIterator.class);
			pageContext.getOut().print(theReportTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

