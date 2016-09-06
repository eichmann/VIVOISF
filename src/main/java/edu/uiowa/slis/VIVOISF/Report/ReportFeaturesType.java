package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportFeaturesIterator theReportFeaturesIterator = (ReportFeaturesIterator)findAncestorWithClass(this, ReportFeaturesIterator.class);
			pageContext.getOut().print(theReportFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for features tag ");
		}
		return SKIP_BODY;
	}
}

