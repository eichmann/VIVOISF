package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasTranslationIterator theReportHasTranslationIterator = (ReportHasTranslationIterator)findAncestorWithClass(this, ReportHasTranslationIterator.class);
			pageContext.getOut().print(theReportHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

