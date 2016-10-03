package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationInterviewerIterator theFundingOrganizationInterviewerIterator = (FundingOrganizationInterviewerIterator)findAncestorWithClass(this, FundingOrganizationInterviewerIterator.class);
			pageContext.getOut().print(theFundingOrganizationInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

