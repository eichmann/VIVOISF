package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHandleIterator theReport = (ReportHandleIterator)findAncestorWithClass(this, ReportHandleIterator.class);
			pageContext.getOut().print(theReport.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for handle tag ");
		}
		return SKIP_BODY;
	}
}

