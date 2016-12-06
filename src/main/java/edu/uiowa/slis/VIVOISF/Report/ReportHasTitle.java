package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportHasTitleIterator theReportHasTitleIterator = (ReportHasTitleIterator)findAncestorWithClass(this, ReportHasTitleIterator.class);
			pageContext.getOut().print(theReportHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

