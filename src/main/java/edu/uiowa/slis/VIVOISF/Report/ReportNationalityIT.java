package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityITIterator theReport = (ReportNationalityITIterator)findAncestorWithClass(this, ReportNationalityITIterator.class);
			pageContext.getOut().print(theReport.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

