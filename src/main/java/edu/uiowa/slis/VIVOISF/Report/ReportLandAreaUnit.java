package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportLandAreaUnitIterator theReport = (ReportLandAreaUnitIterator)findAncestorWithClass(this, ReportLandAreaUnitIterator.class);
			pageContext.getOut().print(theReport.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

