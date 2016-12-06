package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportAgriculturalAreaUnitIterator theReport = (ReportAgriculturalAreaUnitIterator)findAncestorWithClass(this, ReportAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theReport.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

