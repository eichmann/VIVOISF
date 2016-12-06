package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListZHIterator theReport = (ReportNameListZHIterator)findAncestorWithClass(this, ReportNameListZHIterator.class);
			pageContext.getOut().print(theReport.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

