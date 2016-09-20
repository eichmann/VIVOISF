package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportERO_0000045Iterator theReport = (ReportERO_0000045Iterator)findAncestorWithClass(this, ReportERO_0000045Iterator.class);
			pageContext.getOut().print(theReport.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

