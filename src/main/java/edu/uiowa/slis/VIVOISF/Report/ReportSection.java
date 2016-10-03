package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportSectionIterator theReport = (ReportSectionIterator)findAncestorWithClass(this, ReportSectionIterator.class);
			pageContext.getOut().print(theReport.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for section tag ");
		}
		return SKIP_BODY;
	}
}

