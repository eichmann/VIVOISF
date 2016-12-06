package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportPopulationUnitIterator theReport = (ReportPopulationUnitIterator)findAncestorWithClass(this, ReportPopulationUnitIterator.class);
			pageContext.getOut().print(theReport.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

