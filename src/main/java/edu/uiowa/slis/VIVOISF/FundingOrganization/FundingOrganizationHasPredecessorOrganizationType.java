package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationHasPredecessorOrganizationIterator theFundingOrganizationHasPredecessorOrganizationIterator = (FundingOrganizationHasPredecessorOrganizationIterator)findAncestorWithClass(this, FundingOrganizationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theFundingOrganizationHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

