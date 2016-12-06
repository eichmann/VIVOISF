package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNameListRUIterator theReport = (ReportNameListRUIterator)findAncestorWithClass(this, ReportNameListRUIterator.class);
			pageContext.getOut().print(theReport.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

