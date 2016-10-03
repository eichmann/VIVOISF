package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportUpcIterator theReport = (ReportUpcIterator)findAncestorWithClass(this, ReportUpcIterator.class);
			pageContext.getOut().print(theReport.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for upc tag ");
		}
		return SKIP_BODY;
	}
}

