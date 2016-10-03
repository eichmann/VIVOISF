package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationInterviewerIterator theFundingOrganizationInterviewerIterator = (FundingOrganizationInterviewerIterator)findAncestorWithClass(this, FundingOrganizationInterviewerIterator.class);
			pageContext.getOut().print(theFundingOrganizationInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

