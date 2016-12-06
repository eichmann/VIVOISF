package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPopulationYearIterator theReport = (ReportPopulationYearIterator)findAncestorWithClass(this, ReportPopulationYearIterator.class);
			pageContext.getOut().print(theReport.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

