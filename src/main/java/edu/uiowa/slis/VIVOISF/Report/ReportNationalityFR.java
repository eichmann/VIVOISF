package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityFRIterator theReport = (ReportNationalityFRIterator)findAncestorWithClass(this, ReportNationalityFRIterator.class);
			pageContext.getOut().print(theReport.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

