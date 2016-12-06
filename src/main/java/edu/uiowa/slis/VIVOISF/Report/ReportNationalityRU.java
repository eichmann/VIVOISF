package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportNationalityRUIterator theReport = (ReportNationalityRUIterator)findAncestorWithClass(this, ReportNationalityRUIterator.class);
			pageContext.getOut().print(theReport.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

