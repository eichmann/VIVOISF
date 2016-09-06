package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationSponsorsIterator theFundingOrganizationSponsorsIterator = (FundingOrganizationSponsorsIterator)findAncestorWithClass(this, FundingOrganizationSponsorsIterator.class);
			pageContext.getOut().print(theFundingOrganizationSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

