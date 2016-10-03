package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationPerformerInverseIterator theFundingOrganizationPerformerInverseIterator = (FundingOrganizationPerformerInverseIterator)findAncestorWithClass(this, FundingOrganizationPerformerInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for performer tag ");
		}
		return SKIP_BODY;
	}
}

