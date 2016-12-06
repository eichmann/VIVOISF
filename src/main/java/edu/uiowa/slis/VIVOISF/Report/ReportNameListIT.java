package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListITIterator theReport = (ReportNameListITIterator)findAncestorWithClass(this, ReportNameListITIterator.class);
			pageContext.getOut().print(theReport.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

