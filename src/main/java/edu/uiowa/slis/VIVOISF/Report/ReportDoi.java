package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportDoiIterator theReport = (ReportDoiIterator)findAncestorWithClass(this, ReportDoiIterator.class);
			pageContext.getOut().print(theReport.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for doi tag ");
		}
		return SKIP_BODY;
	}
}

