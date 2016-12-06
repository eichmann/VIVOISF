package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCountryAreaUnitIterator theReport = (ReportCountryAreaUnitIterator)findAncestorWithClass(this, ReportCountryAreaUnitIterator.class);
			pageContext.getOut().print(theReport.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

