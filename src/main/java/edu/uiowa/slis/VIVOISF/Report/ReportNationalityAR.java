package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityARIterator theReport = (ReportNationalityARIterator)findAncestorWithClass(this, ReportNationalityARIterator.class);
			pageContext.getOut().print(theReport.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

