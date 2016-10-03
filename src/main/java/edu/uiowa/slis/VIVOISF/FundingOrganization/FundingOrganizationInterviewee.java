package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationIntervieweeIterator theFundingOrganizationIntervieweeIterator = (FundingOrganizationIntervieweeIterator)findAncestorWithClass(this, FundingOrganizationIntervieweeIterator.class);
			pageContext.getOut().print(theFundingOrganizationIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}
