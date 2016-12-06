package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListARIterator theReport = (ReportNameListARIterator)findAncestorWithClass(this, ReportNameListARIterator.class);
			pageContext.getOut().print(theReport.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

