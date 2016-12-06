package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportGDPUnitIterator theReport = (ReportGDPUnitIterator)findAncestorWithClass(this, ReportGDPUnitIterator.class);
			pageContext.getOut().print(theReport.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

