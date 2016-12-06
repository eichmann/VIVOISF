package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListFRIterator theReport = (ReportNameListFRIterator)findAncestorWithClass(this, ReportNameListFRIterator.class);
			pageContext.getOut().print(theReport.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

