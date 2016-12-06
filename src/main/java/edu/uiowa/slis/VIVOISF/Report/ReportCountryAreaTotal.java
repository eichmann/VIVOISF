package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportCountryAreaTotalIterator theReport = (ReportCountryAreaTotalIterator)findAncestorWithClass(this, ReportCountryAreaTotalIterator.class);
			pageContext.getOut().print(theReport.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

