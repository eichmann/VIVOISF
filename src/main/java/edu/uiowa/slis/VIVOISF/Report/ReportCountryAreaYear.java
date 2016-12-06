package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCountryAreaYearIterator theReport = (ReportCountryAreaYearIterator)findAncestorWithClass(this, ReportCountryAreaYearIterator.class);
			pageContext.getOut().print(theReport.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

