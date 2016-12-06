package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityZHIterator theReport = (ReportNationalityZHIterator)findAncestorWithClass(this, ReportNationalityZHIterator.class);
			pageContext.getOut().print(theReport.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

