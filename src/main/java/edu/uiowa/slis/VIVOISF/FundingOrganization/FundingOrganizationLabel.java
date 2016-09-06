package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			if (!theFundingOrganization.commitNeeded) {
				pageContext.getOut().print(theFundingOrganization.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			return theFundingOrganization.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FundingOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			theFundingOrganization.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for label tag ");
		}
	}
}

