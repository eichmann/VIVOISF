package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationInterviewerInverseIterator theFundingOrganizationInterviewerInverseIterator = (FundingOrganizationInterviewerInverseIterator)findAncestorWithClass(this, FundingOrganizationInterviewerInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

