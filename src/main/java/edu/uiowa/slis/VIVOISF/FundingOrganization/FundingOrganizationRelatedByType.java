package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationRelatedByIterator theFundingOrganizationRelatedByIterator = (FundingOrganizationRelatedByIterator)findAncestorWithClass(this, FundingOrganizationRelatedByIterator.class);
			pageContext.getOut().print(theFundingOrganizationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

