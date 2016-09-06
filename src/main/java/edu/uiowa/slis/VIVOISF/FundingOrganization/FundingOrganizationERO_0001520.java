package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationERO_0001520Iterator theFundingOrganizationERO_0001520Iterator = (FundingOrganizationERO_0001520Iterator)findAncestorWithClass(this, FundingOrganizationERO_0001520Iterator.class);
			pageContext.getOut().print(theFundingOrganizationERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

