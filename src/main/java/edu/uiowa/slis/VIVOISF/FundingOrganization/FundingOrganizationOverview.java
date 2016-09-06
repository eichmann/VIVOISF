package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			if (!theFundingOrganization.commitNeeded) {
				pageContext.getOut().print(theFundingOrganization.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			return theFundingOrganization.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing FundingOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			theFundingOrganization.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for overview tag ");
		}
	}
}

