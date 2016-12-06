package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityESIterator theReport = (ReportNationalityESIterator)findAncestorWithClass(this, ReportNationalityESIterator.class);
			pageContext.getOut().print(theReport.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

