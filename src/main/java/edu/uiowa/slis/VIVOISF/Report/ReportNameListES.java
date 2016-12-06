package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListESIterator theReport = (ReportNameListESIterator)findAncestorWithClass(this, ReportNameListESIterator.class);
			pageContext.getOut().print(theReport.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

