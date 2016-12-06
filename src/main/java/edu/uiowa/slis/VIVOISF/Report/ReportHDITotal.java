package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportHDITotalIterator theReport = (ReportHDITotalIterator)findAncestorWithClass(this, ReportHDITotalIterator.class);
			pageContext.getOut().print(theReport.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

