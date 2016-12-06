package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameOfficialRUIterator theReport = (ReportNameOfficialRUIterator)findAncestorWithClass(this, ReportNameOfficialRUIterator.class);
			pageContext.getOut().print(theReport.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

