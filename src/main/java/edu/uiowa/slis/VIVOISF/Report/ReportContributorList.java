package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportContributorListIterator theReportContributorListIterator = (ReportContributorListIterator)findAncestorWithClass(this, ReportContributorListIterator.class);
			pageContext.getOut().print(theReportContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

