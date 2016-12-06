package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportDescriptionIterator theReport = (ReportDescriptionIterator)findAncestorWithClass(this, ReportDescriptionIterator.class);
			pageContext.getOut().print(theReport.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for description tag ");
		}
		return SKIP_BODY;
	}
}

