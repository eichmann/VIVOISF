package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportShortDescriptionIterator theReport = (ReportShortDescriptionIterator)findAncestorWithClass(this, ReportShortDescriptionIterator.class);
			pageContext.getOut().print(theReport.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

