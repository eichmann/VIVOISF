package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPopulationTotalIterator theReport = (ReportPopulationTotalIterator)findAncestorWithClass(this, ReportPopulationTotalIterator.class);
			pageContext.getOut().print(theReport.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

