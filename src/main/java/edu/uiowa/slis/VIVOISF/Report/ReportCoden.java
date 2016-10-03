package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCodenIterator theReport = (ReportCodenIterator)findAncestorWithClass(this, ReportCodenIterator.class);
			pageContext.getOut().print(theReport.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for coden tag ");
		}
		return SKIP_BODY;
	}
}

