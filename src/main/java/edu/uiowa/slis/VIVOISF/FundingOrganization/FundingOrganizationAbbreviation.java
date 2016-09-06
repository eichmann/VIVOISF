package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			if (!theFundingOrganization.commitNeeded) {
				pageContext.getOut().print(theFundingOrganization.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			return theFundingOrganization.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing FundingOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			theFundingOrganization.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for abbreviation tag ");
		}
	}
}

