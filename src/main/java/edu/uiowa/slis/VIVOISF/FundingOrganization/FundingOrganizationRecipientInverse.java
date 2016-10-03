package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationRecipientInverseIterator theFundingOrganizationRecipientInverseIterator = (FundingOrganizationRecipientInverseIterator)findAncestorWithClass(this, FundingOrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

