package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationIntervieweeInverseIterator theFundingOrganizationIntervieweeInverseIterator = (FundingOrganizationIntervieweeInverseIterator)findAncestorWithClass(this, FundingOrganizationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

