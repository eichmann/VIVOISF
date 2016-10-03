package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportEanucc13Iterator theReport = (ReportEanucc13Iterator)findAncestorWithClass(this, ReportEanucc13Iterator.class);
			pageContext.getOut().print(theReport.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

