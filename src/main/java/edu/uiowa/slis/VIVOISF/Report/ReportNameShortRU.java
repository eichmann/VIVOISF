package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameShortRUIterator theReport = (ReportNameShortRUIterator)findAncestorWithClass(this, ReportNameShortRUIterator.class);
			pageContext.getOut().print(theReport.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

