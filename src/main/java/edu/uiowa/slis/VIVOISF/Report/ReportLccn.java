package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportLccnIterator theReport = (ReportLccnIterator)findAncestorWithClass(this, ReportLccnIterator.class);
			pageContext.getOut().print(theReport.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for lccn tag ");
		}
		return SKIP_BODY;
	}
}

